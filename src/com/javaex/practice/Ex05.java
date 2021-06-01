package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double[] intArray = new double[5];
		double A=0;
		
		
		for(int B=0; B<intArray.length; B++) {
			intArray[B] = sc.nextInt();
			A += intArray[B]; 
		}
		
		A /= intArray.length;
		
		System.out.println("평균은 " +A+ " 입니다.");
		sc.close();

	}

}