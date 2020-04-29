package com.org.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.org.entities.Employee;
import com.org.entities.SBU;

@Configuration
@ComponentScan("com.org")
public class JavaConfig 
{
	@Bean
	public SBU sbu() {
		Employee emp1 = new Employee();
		emp1.setEmpId(12345);
		emp1.setEmpName("Krishna");
		emp1.setSalary(50000.0);
		Employee emp2 = new Employee();
		emp2.setEmpId(67890);
		emp2.setEmpName("Mayank");
		emp2.setSalary(60000.0);
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		SBU sbuobj = new SBU();
		sbuobj.setSbuId(99999);
		sbuobj.setSbuHead("Kiran Rao");
		sbuobj.setSbuName("Vikas");
		sbuobj.setEmpList(empList);
		return sbuobj;
	}
}
