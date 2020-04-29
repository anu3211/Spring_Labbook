package com.org.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.org")
@PropertySource("classpath:employee.properties")
public class JavaConfig 
{

}
