package com.subodh.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subodh.springbeans.Student;

public class Main {

	public static void main(String[] args) {
		String config_loc="com/subodh/cfg/ApplicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		Student std1=(Student) context.getBean("stdid1");
		std1.display();

	}

}
