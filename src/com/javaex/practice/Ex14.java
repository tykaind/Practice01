package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("세로를 입력하세요 : ");
		int b = sc.nextInt();
				
		double a2 = a*b;
		double b2 = a*b+2;
		
				
		System.out.println("사각형의 넓이는 : "+a2);
		System.out.println("사각형의 둘레는 : "+b2);
				
		sc.close();

	}

}
