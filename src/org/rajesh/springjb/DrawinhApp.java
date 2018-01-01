package org.rajesh.springjb;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawinhApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle =(Triangle) context.getBean("triangle");
		triangle.draw();


		
	}

}


/*
 * 
 *
 http://blog.pawandubey.com/dependency-injection-a-twenty-five-dollar-term/ 
 
 Dependency Injection is nothing but passing the instance variables of a class in its constructor. 
 So, if we have a class,
 
 public class NeedsInjection{
  Dependency injection;
    NeedsInjection(){
     injection = new Dependency();
    }
} 
 
 */
