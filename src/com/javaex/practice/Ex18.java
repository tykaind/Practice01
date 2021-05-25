package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		int a = sc.nextInt();
		double b = (double)5/9*(a-32.0);
		System.out.println("화씨 "+(double)a+" 의 섭씨온도는 "+b+" 입니다.");
		
		sc.close();
	}

}
