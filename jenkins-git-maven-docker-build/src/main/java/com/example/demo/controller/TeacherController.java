package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class TeacherController {

	@GetMapping(path="/teachers")
	public String getTeacher() {
	List<String> list = Arrays.asList("amar","reka","sumi");
	return list.toString();
	}
	@GetMapping(path="/teachers/{dept}")
	public String getTeacherByDept(@PathVariable("dept") String dept) {
	List<String> list = Arrays.asList("amar","reka","sumi");
	
	if(dept.equals("cse")) {
		list = Arrays.asList("amar","swetha","sumi");		
	}
	return list.toString();
	}
	@GetMapping(path="/teachers/{dept}")
	public String getTeacherById(@PathVariable("dept") String dept1) {
		List<String> list1 = Arrays.asList("amar","reka","sumi");
		if(dept1.equals("ece")) {
			list1 = Arrays.asList("amar","rani","vaani");		
		}
		return list1.toString();
	}
}

