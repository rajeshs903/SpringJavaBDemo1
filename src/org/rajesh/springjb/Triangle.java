package org.rajesh.springjb;

import java.util.List;

public class Triangle {

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
			System.out.println("Point A is x= "+point.getX()+" and y="+point.getY());
		
	}
}
