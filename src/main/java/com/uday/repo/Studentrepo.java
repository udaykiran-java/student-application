package com.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.model.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}
