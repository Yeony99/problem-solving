package com.step1;

import java.util.Scanner;

public class B1000 {
	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner sc=new Scanner(System.in);
		
		int A, B;
		A=sc.nextInt();
		B=sc.nextInt();
		
		System.out.println(A+B);
		
		sc.close();
	}
}
