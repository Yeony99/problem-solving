package com.step1;

import java.util.Scanner;

public class B2588 {
	/*
	 세자릿수 곱셉 과정 자연수까지 노출시키는 문제.
	 (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
	 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.	
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a*(b%10)); //나머지 5
		System.out.println(a*((b%100)/10)); 
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		sc.close();
	}
}
