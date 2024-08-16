package com.shri.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shri.Entity.Student;
import com.shri.Services.StudentService;

@RestController
@RequestMapping("/student")
public class Controller {
	@Autowired
	private StudentService stud;
	
	@GetMapping("/all")
	public List<Student>getAllStudent(){
		return this.stud.getAllStudents();
	}
	
	@GetMapping("/all/{id}")
	public Student getById(@PathVariable long id) {
		return this.stud.getByid(id);
	}
	@GetMapping("/email/{email}")
	public Student getByEmail(@PathVariable String email) {
		return this.stud.getByEmails(email);
	}
	@PostMapping("/add")
	public Student AddStud(@RequestBody Student stud) {
		return this.stud.addStudent(stud);
	}
	@PatchMapping("/update/{id}/{branch}")
	public Student updateStudentData(@PathVariable long id,@PathVariable String branch) {
		return this.stud.updateStudent(id,branch);
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable long id, @RequestBody Student stud) {
		return this.stud.updateStudentDataPut(id,stud);
	}
	@DeleteMapping("/all/{id}")
	public void deleteById(@PathVariable long id) {
		this.stud.deleteId(id);
	}
}
