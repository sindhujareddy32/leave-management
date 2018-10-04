package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
public static void main(String[] args) {
	ApplicationContext app=new ClassPathXmlApplicationContext("resource/spring.xml");
	EmployeeImp e=(EmployeeImp)app.getBean("empdaoimpl");
	Employee emp=new Employee();
	emp.setId(1234);
	/*emp.setUsername("manusha123");
	emp.setPassword("manusha123");
	e.insert(emp);*/
	 
	/*e.fetch();*/
	/*e.update(emp);*/
	e.delete(emp);
}
}
