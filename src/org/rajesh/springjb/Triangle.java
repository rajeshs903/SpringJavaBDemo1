package org.rajesh.springjb;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware{
	//When spring instantiates beans, it looks for a couple of interfaces like ApplicationContextAware and InitializingBean. If they are found, the methods are invoked
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
				System.out.println("Triangle coordinates are");
				System.out.println("Point A is x= "+pointA.getX()+" and y="+pointA.getY());
				System.out.println("Point A is x= "+pointB.getX()+" and y="+pointB.getY());
				System.out.println("Point A is x= "+pointC.getX()+" and y="+pointC.getY());
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("bean name is "+beanName);
		
	}

	
}
