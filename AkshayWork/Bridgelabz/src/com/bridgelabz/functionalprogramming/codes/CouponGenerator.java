package com.bridgelabz.functionalprogramming.codes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.functionalprogramming.exceptions.GenericExceptions;
import com.bridgelabz.functionalprogramming.util.RandomGenerators;

/**
 * @author Akshay
 * @since 17-05-2018
 * 
 *
 */

public class CouponGenerator {
	private static int couponsCounter;
	private static int couponTimes;

	public static void main(String[] args) {
		// MAIN METHOD CALLS GENERATECOUPONS METHOD AND WORK WITH GETTING USER DATA
		Scanner scan = null;
		int noOfCoupons = 0;
		Set<Integer> couponCollector = null;
		try {
			System.out.println("Enter the number of coupons to be generated");
			scan = new Scanner(System.in);
			noOfCoupons = scan.nextInt();
			couponTimes = noOfCoupons;
			if (noOfCoupons < 1) {
				throw new GenericExceptions("Enter number greater than 0");

			} else {
				couponCollector = new HashSet<Integer>();
				generateCoupons(couponCollector);
				System.out.println("The number of times the coupon is generated is "+couponsCounter);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	private static void generateCoupons(Set couponCollector) {
		// TODO Auto-generated method stub
		if (!(couponCollector.size() == couponTimes)) {

			int couponNumber = RandomGenerators.getRandomInt();
			System.out.println("The random value generated is   "+couponNumber);
			couponsCounter++;
			if (couponCollector.contains(couponCollector)) {

			} else {
				couponCollector.add(couponNumber);

			}
			generateCoupons(couponCollector);

		} else {
			return;
		}

	}

}
