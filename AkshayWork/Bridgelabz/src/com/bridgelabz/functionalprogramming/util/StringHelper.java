package com.bridgelabz.functionalprogramming.util;

public class StringHelper {

	static char[] value;

	public static final void setString(String data) {
		value = data.toCharArray();

	}

	// array.length-1 is times
	public static final void recurssivePermutation(int current, int end) {
//		System.out.println(printArray(value));
		
//		System.out.println("current value is : "+current);
//		System.out.println("end value is : "+end);
		int i = 0;
		int times = end;
		if (times >= 0) {

			swap(value, current, times);
			recurssivePermutation(current, times-1);
			swap(value, current, times);
			recurssivePermutation(current+1, times);
			i++;
current++;
			times--;
		} else {
			System.out.println(printArray(value));
			return;
		}
	}

	private static String printArray(char[] value) {
		// TODO Auto-generated method stub
		return new String(value);
	}

	public static final char[] swap(char[] array, int a, int b) {
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;

	}

}
