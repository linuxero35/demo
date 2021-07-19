package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.commons.Message;
import com.example.demo.commons.ResponseObject;
import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentsService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private StudentsService studentsService;

	@GetMapping("/retrieveAll")
	private ResponseObject getAllStudents() {
		try {
			return new ResponseObject(studentsService.getAllStudents(), HttpStatus.OK.value(), null);
		} catch (Exception e) {
			return new ResponseObject(null, HttpStatus.MULTIPLE_CHOICES.value(), e.getMessage());
		}
	}

	@PostMapping("/save")
	private ResponseObject save(@RequestBody StudentDTO dto) {
		try {
			studentsService.save(dto);
			return new ResponseObject(Message.SUCCESS, HttpStatus.OK.value(), null);
		} catch (Exception e) {
			return new ResponseObject(null, HttpStatus.MULTIPLE_CHOICES.value(), e.getMessage());
		}
	}
}
