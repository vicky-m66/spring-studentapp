package com.student.studentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentsapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
