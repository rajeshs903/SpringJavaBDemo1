package org.rajesh.springjb;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//first interface methods will executed followed by the custom methods when both of the ways followed simultaneously
public class Triangle implements InitializingBean ,DisposableBean {

	private  Point pointA;
	private Point pointB;
	private Point pointC;
	
	
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
	public void afterPropertiesSet() throws Exception {
		System.out.println(" afterPropertiesSet method() inside the Triangle bean");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println(" destroy method() inside the Triangle bean");

		
	}
	
	public void myInit()
	{
		System.out.println("custom init method registered in bean definition as init-method ");
	}
	
	
	public void myDestroy()
	{
		System.out.println("custom destroy method registered in bean definition as destroy-method");
	}
}
