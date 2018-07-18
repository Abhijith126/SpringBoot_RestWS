package com.mindtree.service;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.client.RestTemplate;

import com.mindtree.model.Employee;

public class EmployeeServiceTest {

	private static final String BASE_URL = "http://localhost:8080";

	private RestTemplate restTemplate = new RestTemplate();
	

	//@Test
	public void insertNewEmployeeTest() throws ParseException {
		String url = BASE_URL + "/emp";
		Employee emp = new Employee();
		emp.setName("Abhijith");
		emp.setAge(30);
		emp.setCity("Pune");
		emp.setDob(new SimpleDateFormat("dd-MM-yyyy").parse("12-06-1993"));
		IdVo newEmp = restTemplate.postForObject(url, emp,IdVo.class);
		assertTrue(newEmp.getId()>0);
	}
	
}
