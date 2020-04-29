package com.org.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.config.JavaConfig;
import com.org.entities.Employee;
import com.org.entities.SBU;

public class Main 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();
		SBU sbu = context.getBean(SBU.class);
		System.out.println(sbu);
}
}
