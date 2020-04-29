package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.org.dao.EmployeeDaoImpl;
import com.org.entities.Employee;

@Component
public class EmployeeServiceImpl implements IEmployeeService
{
	private EmployeeDaoImpl empdao;
	
	public EmployeeDaoImpl getEmpdao() {
		return empdao;
	}
	@Autowired
	public void setEmpdao(EmployeeDaoImpl empdao) {
		this.empdao = empdao;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empdao.getAllEmployees();
	}

	@Override
	public Employee findEmployee(int id) {
		Employee emp = empdao.findEmployee(id);
		if(emp==null)
		{
			System.out.println("Employee Not Found");
		}
		return emp;
	}

}
