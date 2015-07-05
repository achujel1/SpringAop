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

		// space for some code

	}

	/**
	 * 
	 */
	private static void testingConfigWiring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",
				ShapeService.class);
		shapeService.getCircle();
	}

	/**
	 * 
	 */
	private static void testingAroundAdvice() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",
				ShapeService.class);
		shapeService.getCircle();
	}

	/**
	 * @throws BeansException
	 */
	private static void testingAfterAdviceTypes() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		ShapeService shapeService = context.getBean("afterAdvice",
				ShapeService.class);

		// Testing how single argument method is being called with an exception
		// thrown
		shapeService.getCircle().setNameandReturn("Dummy name");

		// Testing how single argument method is being called with a return
		shapeService.getCircle().setName("Dummy name");
	}

	/**
	 * @throws BeansException
	 */
	private static void testingJoinPointsAndAdviceArguments()
			throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = context.getBean("pointcut2",
				ShapeService.class);

		// Setting the name of a circle:
		shapeService.getCircle().setName("Dummy name");

		System.out.println(shapeService.getCircle().getName());
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
		testingJoinPointsAndAdviceArguments();
		testingAfterAdviceTypes();
		testingAroundAdvice();
		testingConfigWiring();
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
