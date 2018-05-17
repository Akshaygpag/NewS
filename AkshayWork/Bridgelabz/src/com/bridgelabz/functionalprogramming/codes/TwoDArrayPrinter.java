package com.bridgelabz.functionalprogramming.codes;

import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelabz.functionalprogramming.util.ArrayHelper;

public class TwoDArrayPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row,col;
		Scanner scan=null;
int matrix[][]=null;
		try {
		System.out.println("Enter the number of rows ");
		scan=new Scanner(System.in);	
		row=scan.nextInt();
			System.out.println("Enter the number of cols ");
			col=scan.nextInt();
		
			
		matrix=	ArrayHelper.setIntArrayData(row, col);
			
			printMatrix(matrix);

		
		
		}catch(Exception e) {}
		
		
		
	}

	private static void printMatrix(int[][] matrix) {
StringBuffer sb=new StringBuffer();		
		System.out.println("\tThe array in matrix is here is ");
		System.out.println();
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix[i].length;j++) {
				
				sb.append("\t"+matrix[i][j]+" ");
				
			}
			sb.append("\n");
			
		}
		
		PrintWriter printWriter=new PrintWriter(System.out);
		printWriter.write(sb.toString());
		printWriter.flush();
		
		
	}

}
