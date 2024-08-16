package com.shri.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shri.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

	Student findStudentById(long id);
	Student findStudentByEmail(String email);
}
