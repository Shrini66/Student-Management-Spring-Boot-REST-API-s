package com.shri.Services;

import java.util.List;

import com.shri.Entity.Student;

public interface StudentService {
	public List<Student>getAllStudents();
	
	public Student addStudent(Student stud);

	public Student getByid(long id);
	
	public Student getByEmails(String email);

	public void deleteId(long id);

	public Student updateStudent(long id,String branch);

	public Student updateStudentDataPut(long id, Student stud);
}
