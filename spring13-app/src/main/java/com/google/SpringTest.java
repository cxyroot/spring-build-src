package com.google;

import com.google.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;

public class SpringTest {

	public static void main(String[] args) {
		/*Resource resource =new ClassPathResource("applicationContext.xml");
		//BeanFactory bf=new XmlBeanFactory(resource);
		//Student stu=(Student)bf.getBean("stu");
		//System.out.println(stu);
		String fileName = resource.getFilename();
		try {
			URI uri = resource.getURI();
			System.out.println(uri);
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		//System.out.println(fileName);


		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu=(Student)ac.getBean("stu");
		System.out.println(stu);
	}

}
