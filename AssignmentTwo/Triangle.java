package com.smoothstack.training.assignmenttwo;

public class Triangle implements Shape{
	
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of a triangle is base times height divided by 2");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Base: "+ base +"\nHeight: "+ height + "\nArea: " + base*height*.5);
	}

}

