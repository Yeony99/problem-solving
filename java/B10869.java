package com.step1;

import java.util.Scanner;

public class B10869 {
	public static void main(String[] args) {
	//�� �ڿ��� A�� B�� �־�����.
	//�̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�	
		Scanner sc=new Scanner(System.in);
		
		int A, B; 
		A= sc.nextInt();
		B= sc.nextInt();
		
		System.out.print((A+B)+"\n"+(A-B)+"\n"+(A*B)+"\n"+(A/B)+"\n"+(A%B)+"\n");
	
		sc.close();
	}
}
