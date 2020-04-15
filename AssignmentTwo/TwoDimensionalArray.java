package com.smoothstack.training.assignmenttwo;

import java.util.Random;

public class TwoDimensionalArray {
	
	private int[][] matrix;
	
	public TwoDimensionalArray(int width, int height) {
		if (width < 1)
			width = 1;
		if (height < 1)
			height = 1;
		matrix = new int[width][height];
		Random rand = new Random();
		System.out.println("This 2D Array consists of: ");
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
					matrix[i][j] = rand.nextInt(100);
					System.out.println("(" + i + "," + j + "): " + matrix[i][j]);
			}
		}
	}
	
	public void findMax() {
		int max = 0;
		int x = 0;
		int y = 0;
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println("The max value is " + max + " located at " + x + "," + y);
	}

}
