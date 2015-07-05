package org.roba.springaop.service;

import org.roba.springaop.aspect.LoggingAspect;
import org.roba.springaop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
