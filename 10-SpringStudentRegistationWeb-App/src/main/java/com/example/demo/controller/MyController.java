package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.StudentBean;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class MyController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/loadForm")
	public String loadRegForm(Model model) {
		//studentService.setAllData();
		
		model.addAttribute("gender",studentService.getGenders());
		model.addAttribute("course",studentService.getCourses());
		model.addAttribute("timings",studentService.getTimings());
		
		Student sobj=new Student();
		model.addAttribute("student", sobj);
		return "index";
		
	}
	@PostMapping("/regStudent")
	public String handleRegBtnClick(StudentBean student,Model model) {
		Student stu=new Student();
		System.out.println(student);
	    String time=	student.getTimings().toString();
	    stu.setName(student.getName());
	    stu.setEmail(student.getEmail());
	    stu.setPhoneNo(student.getPhoneNo());
	    stu.setGender(student.getGender());
	    stu.setCourse(student.getCourse());
	    stu.setTimings(student.getTimings());
//	    for(int i=0;i<student.getTimings().length;i++) {
//	    String time1[]=student.getTimings();
//	    String dataString="";
//	    for(String data:time1) {
//	    	dataString=dataString+data+",";
//	    }
//	    stu.setTimings(dataString);
//	   // }
	    System.out.println("the data is:"+stu.getTimings());
		studentService.sendData(stu);
		model.addAttribute("msg", "student register successfully");
		return "dashboard";
		
	}

}
