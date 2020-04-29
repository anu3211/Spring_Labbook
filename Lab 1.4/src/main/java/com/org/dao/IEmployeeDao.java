package com.org.dao;

import java.util.List;
import com.org.entities.Employee;

public interface IEmployeeDao 
{
	List<Employee>getAllEmployees();
	Employee findEmployee(int id);
}
