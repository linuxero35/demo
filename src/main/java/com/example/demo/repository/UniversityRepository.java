package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.University;
import com.example.demo.model.UniversityPK;

public interface UniversityRepository extends CrudRepository<University, UniversityPK> {

}
