package org.rajesh.springjb;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawinhApp {

	public static void main(String[] args) {
		//Triangle triangle=new Triangle(); // normal way of creating objects
		
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle =(Triangle) factory.getBean("triangle");
		triangle.draw();

		
	}

}
