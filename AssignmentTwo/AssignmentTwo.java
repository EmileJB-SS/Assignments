package com.smoothstack.training.assignmenttwo;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (String input : args) {
			int addend = 0;
			try {
				addend = Integer.parseInt(input);
			}
			catch (NumberFormatException e){
				addend = 0;
			}
			finally {
				sum += addend;
			}
		}
		System.out.println("The sum of all arguments is " + sum + "\n");
		TwoDimensionalArray matrix = new TwoDimensionalArray(3,3);
		matrix.findMax();
		
		System.out.println("\nRectangle: ");
		Rectangle rect = new Rectangle(3,6);
		rect.calculateArea();
		rect.display();
		System.out.println("\nTriangle: ");
		Triangle tri = new Triangle(3,5);
		tri.calculateArea();
		tri.display();
		System.out.println("\nCircle: ");
		Circle circ = new Circle(4);
		circ.calculateArea();
		circ.display();
	}

}
