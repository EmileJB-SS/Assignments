package com.smoothstack.training.assignmenttwo;

public class Circle implements Shape{
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of a circle is Pi times radius squared");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Radius: "+ radius + "\nArea: " + Math.PI*(radius*radius));
	}

}
