package org.roba.springaop;

import org.roba.springaop.service.ShapeService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class to work with Spring AOP
 * 
 * @author Adminas
 *
 */
public class AopMain {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// space to code
	}

	/**
	 * @throws BeansException
	 */
	private static void morePointcutTesting() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = context.getBean("pointcut2",
				ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
	}

	/**
	 * @throws BeansException
	 */
	private static void testingPointcut() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = context.getBean("pointcut",
				ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
	}

	/**
	 * Just simplye testing aspects in Spring
	 * 
	 * @throws BeansException
	 */
	private static void testingAspectsInSpringAOP() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = context.getBean("shapeService",
				ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
	}

	/**
	 * List of methods which have been tested. They will be kept here for future
	 * use
	 * 
	 * @throws BeansException
	 */
	private static void testedMethods() throws BeansException {
		initialMethod();
		testingAspectsInSpringAOP();
		testingPointcut();
		morePointcutTesting();
	}

	/**
	 * Just a simple method to start this ball of Spring AOP rolling
	 * 
	 * @throws BeansException
	 */
	private static void initialMethod() throws BeansException {
		testingAspectsInSpringAOP();
	}
}
