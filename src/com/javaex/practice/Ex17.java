package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double a = sc.nextInt();
		double b = a*a*a;
		double f = (4.0/3.0);
		double c = f*b*3.14;
		System.out.println("구의부피는: "+c+" 입니다.");
		
		
		sc.close();

	}

}
