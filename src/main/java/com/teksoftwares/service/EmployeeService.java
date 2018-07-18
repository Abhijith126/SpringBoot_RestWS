package com.mindtree.service;

import org.springframework.stereotype.Service;

import com.mindtree.exceptions.IncorrectAgeException;
import com.mindtree.exceptions.IncorrectCityException;
import com.mindtree.exceptions.IncorrectDateException;
import com.mindtree.exceptions.IncorrectNameException;
import com.mindtree.model.Employee;

@Service
public class EmployeeService {

	private int i = 0;

	public String insertNewEmployee(Employee emp) {
		if (emp != null)
			if (emp.getName() == null || emp.getName().trim().length() <= 2)
				throw new IncorrectNameException("Name cannot be Null");
			else if (emp.getAge() > 99 || emp.getAge() == 0)
				throw new IncorrectAgeException("Age cannot be Null");
			else if (emp.getCity() == null || emp.getCity().trim().length() <= 2)
				throw new IncorrectCityException("City cannot be Null");
			else if (emp.getDob() == null)
				throw new IncorrectDateException("Date cannot be Null");
		return "{\"id\" : " + (++i) + "}";
	}

}
