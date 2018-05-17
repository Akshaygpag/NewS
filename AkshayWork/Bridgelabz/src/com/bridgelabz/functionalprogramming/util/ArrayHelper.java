package com.bridgelabz.functionalprogramming.util;

import java.util.Scanner;

public class ArrayHelper {
	public static final int[][] setIntArrayData(int row, int col) {

		Scanner scan = new Scanner(System.in);
		int arrayData[][] = new int[row][col];
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.println("Enter the data at [" + i + "]" + "[" + j + "]");
				int data = scan.nextInt();
				arrayData[i][j] = data;

			}

		}
		scan.close();
		return arrayData;

	}

	public static final int[] setSingleIntArrayData(int len) {
		int array[] = new int[len];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter data at " + i + " position");
			array[i] = scan.nextInt();

		}
		scan.close();
		return array;

	}
	
	public static void printTicTacToe(char game[][]) {
		// GENERATES VISUAL TO THE PLAYER
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<game.length;i++) {
			for(int j=0;j<game[i].length;j++) {
				
				sb.append("\t"+game[i][j]+"");
				
			}
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
