package org.javabrains6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class DrawingApp {

	public static void main(String[] args) {
		
		/*Triangle triangle = new Triangle();
		triangle.draw();*/
		
		//Note the below to work spring.xml should be in Springs path
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");	
		triangle.draw();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();
				
		((ClassPathXmlApplicationContext)context).close();
	}
}
