package step1;

import java.util.Scanner;

public class B2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		for(int i=0; i<5; i++) {
			a += Math.pow(sc.nextInt(), 2);
		}
		System.out.println(a%10);
		sc.close();
	}
	
}
