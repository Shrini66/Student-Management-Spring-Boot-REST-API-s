package com.shri.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shri.Entity.Student;
import com.shri.Repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studRepo;
	
	@Override
	public List<Student> getAllStudents() {
		return studRepo.findAll();
	}

	@Override
	public Student addStudent(Student stud) {
		return this.studRepo.save(stud);
	}

	@Override
	public Student getByid(long id) {
		return this.studRepo.findStudentById(id);
	}
	
	@Override
	public Student getByEmails(String email) {
		return this.studRepo.findStudentByEmail(email);
	}

	@Override
	public void deleteId(long id) {
		this.studRepo.deleteById(id);		
	}

	@Override
	public Student updateStudent(long id, String branch) {
		Student s=this.studRepo.findStudentById(id);
		if(s!=null) {
			s.setBranch(branch);
			return this.studRepo.save(s);
		}
		return null;
	}

	@Override
	public Student updateStudentDataPut(long id, Student stud) {
		Student s=this.studRepo.findStudentById(id);
		if(s!=null) {
			s.setName(stud.getName());
			s.setBranch(stud.getBranch());
			s.setMarks(stud.getMarks());
			s.setMobile(stud.getMobile());
			s.setEmail(stud.getEmail());
			
			return this.studRepo.save(s);
		}
		return null;
	}
}
