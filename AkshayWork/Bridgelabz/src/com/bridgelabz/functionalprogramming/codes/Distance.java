package com.bridgelabz.functionalprogramming.codes;

import com.bridgelabz.functionalprogramming.exceptions.GenericExceptions;

public class Distance {
	public static void main(String[] args) {
		// THIS METHOD WILL CALL THE DISTANCECALCULATOR METHOD AND PRINT THE RESULT

		try {

			if (args.length != 2) {
				throw new GenericExceptions("Enter only two values x and y");

			}
			distanceCalculator(args[0],args[1]);
			
			
			
		} catch (GenericExceptions e) {
			System.out.println(e.getMessage());

		}

	}

	private static void distanceCalculator(String xS, String yS) {
		// TODO Auto-generated method stub
		
		int x=Integer.parseInt(xS);
		int y=Integer.parseInt(yS);
		
		
		System.out.print("The distance of (x,y)->"+x+","+y+" from (0,0) is ");
		
		double hypo=Math.pow(x,2);
		hypo+=Math.pow(y, 2);
		hypo=Math.sqrt(hypo);
		System.out.println(hypo+" units");
		
	}
}
