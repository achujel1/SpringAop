package org.roba.springaop.aspect;

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
	// And now using it iwth allCircleMethods()
	@Before("allGetters() && allCircleMethods()")
	private void LoggingAdivce() {
		System.out.println("Advice run. Get method called");
	}

	@Before("allGetters()")
	private void SecondAdvice() {
		System.out.println("This is a second advice method");
	}

	// Pointcut allows to cut inside the Before Annotation
	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	// Creating new @Pointcut
	@Pointcut("within(org.roba.springaop.model.Circle)")
	private void allCircleMethods() {
	}
}
