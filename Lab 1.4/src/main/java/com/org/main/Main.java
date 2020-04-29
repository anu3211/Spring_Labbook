package com.org.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.org.config.JavaConfig;
import com.org.entities.Employee;
import com.org.service.EmployeeServiceImpl;

public class Main 
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();
		EmployeeServiceImpl empimpl = context.getBean(EmployeeServiceImpl.class);
		List<Employee> emplist = empimpl.getAllEmployees();
		System.out.println("Enter the Employee Id : ");
		int id= scn.nextInt();
		Employee employee=empimpl.findEmployee(id);
		System.out.println(employee);
	}
}
