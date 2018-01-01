package org.rajesh.springjb;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawinhApp {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook(); // to close the context when it is done, applicable only for desktop application like this project
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
