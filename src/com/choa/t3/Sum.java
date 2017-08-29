package com.choa.t3;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b; 
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		int sum = a + b;
		System.out.println(a + "+" + b + "=" + a+b);
	}

}
