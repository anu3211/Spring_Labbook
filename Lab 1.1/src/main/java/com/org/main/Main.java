package com.org.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.org.config.JavaConfig;
import com.org.entities.Employee;

public class Main 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();
		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee Details");
		System.out.println("--------------------------------");
		System.out.println("Employee ID : "+employee.getEmpId());
		System.out.println("Employee Name : "+employee.getEmpName());
		System.out.println("Employee Salary : "+employee.getSalary());
		System.out.println("Employee BU : "+employee.getBu());
		System.out.println("Employee Age : "+employee.getEmpAge());
	}
}
