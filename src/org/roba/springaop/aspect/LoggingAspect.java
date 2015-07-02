package org.roba.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Aspect class
 * 
 * @author Adminas
 *
 */
@Aspect
public class LoggingAspect {

	// Annotation before is calling methods BEFORE the method LogginAdvice is
	// called
	// And now using it with allCircleMethods()
	// @Before("allGetters() && allCircleMethods()")

	// Changing the methods
	@Before("allGetters() && allCircleMethods()")
	private void LoggingAdivce(JoinPoint joinPoint) {
		// We comment this object for a test
		// System.out.println(joinPoint.toString());

		// We can also use getTarget() method
		// System.out.println(joinPoint.getTarget());

		// We can access Circle methods from here:
		// Circle circle = (Circle) joinPoint.getTarget();

	}

	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out
				.println("A method that takes String arguments when being called. The value is "
						+ name);
	}

	// Commenting this for for JoinPoints and Advice Arguments test
	/*
	 * @Before("allGetters()") private void SecondAdvice() {
	 * System.out.println("This is a second advice method"); }
	 */
	// @Pointcut allows to cut inside the Before Annotation
	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	// Creating new @Pointcut
	@Pointcut("within(org.roba.springaop.model.Circle)")
	private void allCircleMethods() {
	}
}
