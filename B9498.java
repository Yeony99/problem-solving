package com.step1;

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int S = sc.nextInt();
		
		System.out.print((S>=90)?"A":(S>=80)?"B":(S>=70)?"C":(S>=60)?"D":"F");
		
		sc.close();
	}
}
