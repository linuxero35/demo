package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.Student;
import com.example.demo.model.UniversityPK;
import com.example.demo.repository.StudentsRepository;
import com.example.demo.repository.UniversityRepository;

@Service
public class StudentsService {

	@Autowired
	private StudentsRepository studentsRepo;

	@Autowired
	private UniversityRepository universityRepository;

	public List<Student> getAllStudents() throws Exception {

		List<Student> students = new ArrayList<Student>();

		studentsRepo.findAll().forEach(o -> students.add(o));

		return students;
	}

	private StudentDTO parseEntityTODTO(Student entity) throws Exception {
		StudentDTO dto = new StudentDTO();

		dto.setUserId(entity.getUserId());
		dto.setUsername(entity.getUsername());
		dto.setUniversityNumber(entity.getUniversity().getUniversityId().getUniversityNumber());
		dto.setRegionId(entity.getUniversity().getUniversityId().getRegionId());
		dto.setActive(entity.getActive());
		dto.setModifuserId(entity.getModifUserId() == null ? entity.getCreateUserId() : entity.getModifUserId());
		dto.setModifDate(new SimpleDateFormat("dd//MM//yyy")
				.format((entity.getModifDate() == null ? entity.getCreateDate() : entity.getModifDate())));

		return dto;
	}

	private Student parseDTOToEntity(StudentDTO dto) throws Exception {
		Student entity = new Student();

		entity.setUserId(dto.getUserId());
		entity.setUsername(dto.getUsername());
		entity.setUniversity(
				universityRepository.findById(new UniversityPK(dto.getUniversityNumber(), dto.getRegionId())).get());
		entity.setActive(dto.getActive());
		entity.setCreateUserId(dto.getUserId());
		entity.setModifUserId(dto.getUniversityNumber() != 0 ? dto.getModifuserId() : null);

		return entity;
	}

	public void save(StudentDTO dto) throws Exception {
		Student entity = parseDTOToEntity(dto);

		studentsRepo.save(entity);
//		return parseEntityTODTO(studentsRepo.save(entity));
	}
}
