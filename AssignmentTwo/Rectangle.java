package com.smoothstack.training.assignmenttwo;

public class Rectangle implements Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("The area  of a rectangle is width times height");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Width: "+ width +"\nHeight: "+ height + "\nArea: " + width*height);
	}

}
