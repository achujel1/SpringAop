package org.roba.springaop.service;

import org.roba.springaop.aspect.Loggable;
import org.roba.springaop.model.Circle;
import org.roba.springaop.model.Triangle;

public class ShapeService {
	private Triangle triangle;
	private Circle circle;

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	@Loggable
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

}
