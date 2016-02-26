package org.javabrains1;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
	
	/*private Point pointA;
	private Point pointB;
	private Point pointC;*/
	
	private List<Point> points;
	
	private ApplicationContext context = null;
	
	/*public Point getPointA() {
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
	}*/
	
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		/*System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+", "+getPointC().getY()+")");*/
		
		for(Point point : points) {
			System.out.println("Point A = ("+point.getX()+", "+point.getY()+")");
		}
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {		
		this.context = context;	
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is:" + beanName);
	}
}
