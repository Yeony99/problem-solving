package com.step1;

import java.util.Scanner;

public class B2588 {
	/*
	 ���ڸ��� ���� ���� �ڿ������� �����Ű�� ����.
	 (1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
	 (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.	
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a*(b%10)); //������ 5
		System.out.println(a*((b%100)/10)); 
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		sc.close();
	}
}
