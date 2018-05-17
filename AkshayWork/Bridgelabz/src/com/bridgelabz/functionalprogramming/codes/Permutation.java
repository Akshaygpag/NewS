package com.bridgelabz.functionalprogramming.codes;

import com.bridgelabz.functionalprogramming.util.StringHelper;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="DOG";
StringHelper.setString(name);
StringHelper.recurssivePermutation(0, name.length()-1);
	}

}
