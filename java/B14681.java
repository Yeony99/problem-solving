package com.step1;

import java.util.Scanner;

public class B14681 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x, y;
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println(x>0 && y>0?1:x<0 && y>0?2:x<0 && y<0?3:x>0 && y<0?4:" ");
		
		
		sc.close();
	}
}
