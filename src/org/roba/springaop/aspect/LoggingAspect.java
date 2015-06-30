package org.roba.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	private void LoggingAdivce() {
		System.out.println("Advice run. Get method called");
	}

}
