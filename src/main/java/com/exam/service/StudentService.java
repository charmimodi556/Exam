package com.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public void addStd(Student student) {
		studentRepository.save(student);
	}

	public List<Student> listStd() {
		List<Student> stdList = new ArrayList<>();
		studentRepository.findAll().forEach(student1 -> stdList.add(student1));
		return stdList;
	}

	public void updStd(Student student) {
		studentRepository.save(student);
	}

	public void delStd(int id) {
		studentRepository.deleteById(id);
	}

	public int totalMark(String name) {
		List<Student> stdList = listStd();
		
		int total=0;
		
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).getName().equalsIgnoreCase(name)) {
				int maths = stdList.get(i).getMaths();
				int physics = stdList.get(i).getPhysics();
				int chemestry = stdList.get(i).getChemestry();
				total = maths + physics + chemestry;
			}
		}
		return total;
	}

	public int avgMark(String name) {
		List<Student> stdList = listStd();
		
		int total=0;
		
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).getName().equalsIgnoreCase(name)) {
				int maths = stdList.get(i).getMaths();
				int physics = stdList.get(i).getPhysics();
				int chemestry = stdList.get(i).getChemestry();
				total = maths + physics + chemestry;
			}
		}
		
		int avg = total / 3;
		
		return avg;
	}

	public float percentage(String name) {
		List<Student> stdList = listStd();
		
		int total=0;
		float percentage=0.0F;
		
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).getName().equalsIgnoreCase(name)) {
				int maths = stdList.get(i).getMaths();
				int physics = stdList.get(i).getPhysics();
				int chemestry = stdList.get(i).getChemestry();
				total = maths + physics + chemestry;
				System.out.println("total : " + total);
				percentage = ( total * 100 ) / 300;
			}
		}
		
		return percentage;
	}

	public String result(String name) {
		List<Student> stdList = listStd();
		
		String result="Pass";
		
		for(int i=0;i<stdList.size();i++) {
			
				if(stdList.get(i).getName().equalsIgnoreCase(name)) {	
					if(stdList.get(i).getMaths() <= 34 || stdList.get(i).getPhysics() <= 34 || stdList.get(i).getChemestry() <= 34) {
						result = "Fail";
						return result;
					}
				}
		}
		
		return result;
	}
}
