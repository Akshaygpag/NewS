package com.bridgelabz.functionalprogramming.util;

import java.util.Random;

public class RandomGenerators {
	public static final int getRandomInt() {

		Random rand = new Random();
		return rand.nextInt()%10;

	}
}
