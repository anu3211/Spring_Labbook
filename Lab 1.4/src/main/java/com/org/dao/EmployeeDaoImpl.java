package com.org.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.org.entities.Employee;

@Component
public class EmployeeDaoImpl implements IEmployeeDao
{
	private Map<Integer, Employee> save = new HashMap<Integer, Employee>();

	public EmployeeDaoImpl() {
		save.put(100,new Employee(100,"Anubhav",40000));
		save.put(101,new Employee(101,"Vaibhav",50000));
		save.put(102,new Employee(102,"Manish",60000));
		save.put(103,new Employee(103,"Ankit",70000));
		save.put(104,new Employee(104,"Utkarsh",90000));
	}

	@Override
	public List<Employee> getAllEmployees() {
		Collection<Employee> collection = save.values();
		List<Employee> empList = new ArrayList(collection);
		return empList;
	}

	@Override
	public Employee findEmployee(int id) {
		Employee employee = save.get(id);
		return employee;
	}
}
