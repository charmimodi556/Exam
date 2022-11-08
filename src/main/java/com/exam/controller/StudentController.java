package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.Student;
import com.exam.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		studentService.addStd(student);
		return "Student added successfully!!";
	}
	
	@GetMapping("/")
	public List<Student> listStudent() {
		List<Student> lStudents =  studentService.listStd();
		return lStudents;
	}
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		studentService.updStd(student);
		return "Student updated successfully!!";
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.delStd(id);
		return "Student deleted successfully!!";
	}
	
	@GetMapping("/totalMarks")
	public int totalMarks(@RequestBody Student student) {
		int tmarks = studentService.totalMark(student.getName());
		return tmarks;
	}
	
	@GetMapping("/avgMarks")
	public int avgMarks(@RequestBody Student student) {
		int avg = studentService.avgMark(student.getName());
		return avg;
	}
	
	@GetMapping("/percentage")
	public float percentage(@RequestBody Student student) {
		float per = studentService.percentage(student.getName());
		return per;
	}
	
	@GetMapping("/exam/result")
	public String result(@RequestBody Student student) {
		String result = studentService.result(student.getName());
		return result;
	}
	
}
