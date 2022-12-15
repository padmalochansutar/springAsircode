package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Genders;
import com.example.demo.entity.Student;
import com.example.demo.entity.Timing;
import com.example.demo.repository.CoursesRepository;
import com.example.demo.repository.GendersRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TimingRepository;



@Service
public class StudentService {
	@Autowired
	private GendersRepository gendersRepository;
	@Autowired
	private CoursesRepository coursesRepository;
	@Autowired
	private TimingRepository timingRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<String> getGenders(){
		List<Genders> findAll = gendersRepository.findAll();
		List<String> genders=new ArrayList<>();
		findAll.forEach(gender -> {
			genders.add(gender.getGenderName());
		});
		return genders;
	}
	
	public List<String> getCourses(){
		List<Courses> findAll=coursesRepository.findAll();
		List<String> courses=new ArrayList<>();
		findAll.forEach(course -> {
			courses.add(course.getCourseName());
		});
		return courses;
	}
	
	public List<String> getTimings(){
		List<Timing> findAll = timingRepository.findAll();
		List<String> timings=new ArrayList<>();
		findAll.forEach(timing -> {
			timings.add(timing.getTimingName());
		});
		
		return timings;
	}

	public void setAllData() {
		List<Genders> gen=new ArrayList<>();
		Genders genders=new Genders();
		genders.setGenderName("Male");
		Genders genders1=new Genders();
		genders1.setGenderName("Female");
		gen.add(genders);
		gen.add(genders1);
		gendersRepository.saveAll(gen);
		
		List<Courses> courses=new ArrayList<>();
		Courses course=new Courses();
		course.setCourseName("Java");
		Courses course1=new Courses();
		course1.setCourseName("Python");
		Courses course2=new Courses();
		course2.setCourseName("PHP");
		courses.add(course);
		courses.add(course1);
		courses.add(course2);
		coursesRepository.saveAll(courses);
		
		List<Timing> timings=new ArrayList<>();
		Timing timing=new Timing();
		timing.setTimingName("Morning");
		Timing timing1=new Timing();
		timing1.setTimingName("AfterNoon");
		Timing timing2=new Timing();
		timing2.setTimingName("Evening");
		timings.add(timing);
		timings.add(timing1);
		timings.add(timing2);
		timingRepository.saveAll(timings);
	}

	public void sendData(Student student) {
		 studentRepository.save(student);
		
	}
}
