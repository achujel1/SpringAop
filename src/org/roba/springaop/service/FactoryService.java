package org.roba.springaop.service;

import org.roba.springaop.model.Circle;
import org.roba.springaop.model.Triangle;

/**
 * Just a simple class to test spring wiring without spring.xml configuration
 * 
 * @author Adminas
 *
 */
public class FactoryService {

	/**
	 * Method which is helping us to work without spring.xml configuration
	 * 
	 * @param beanType
	 * @return
	 */
	public Object getBean(String beanType) {
		if (beanType.equals("shapeService"))
			return new ShapeServiceProxy();
		if (beanType.equals("circle"))
			return new Circle();
		if (beanType.equals("triangle"))
			return new Triangle();
		return null;
	}
}
