package com.step1;

import java.util.Scanner;

public class B2753 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int y = sc.nextInt();
		
		System.out.println(y%4 ==0 && y%100!=0 || y%400==0 ? 1 : 0);
		sc.close();
	}
}
