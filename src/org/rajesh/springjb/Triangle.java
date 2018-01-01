package org.rajesh.springjb;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;

public class Triangle implements BeanNameAware {

	private  List<Point> points;	//instead of pointA pointB pointC.. Taken List.. example for Collection dependency injection
	
	
	
	
	public List<Point> getPoints() {
		return points;
	}




	public void setPoints(List<Point> points) {
		this.points = points;
	}




	public void draw() {
		System.out.println("Triangle coordinates are");
		for (Point point:points)
			System.out.println("Point is x= "+point.getX()+" and y="+point.getY());
		
	}




	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0.toString());
		
	}
}
