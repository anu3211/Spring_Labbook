package com.org.service;

import java.util.List;

import com.org.entities.Employee;

public interface IEmployeeService 
{
	List<Employee>getAllEmployees();
	Employee findEmployee(int id);
}
