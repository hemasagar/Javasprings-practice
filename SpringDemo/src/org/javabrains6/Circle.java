package org.javabrains6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
//	@Required
	
//	@Autowired
//	@Qualifier("circleRelated")
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Point is: ("+center.getX()+", "+ center.getY() + ")");
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}
}
