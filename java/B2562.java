package step1;

import java.util.Scanner;

public class B2562 {
	public static void main(String[] args) {
		int index=0;
		int []n = new int[9];
		int max = n[0];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<n.length; i++) {
			n[i]= sc.nextInt();
		}
		for(int i=0; i<n.length; i++) {
			if(n[i]>max) {
				max=n[i];
				index=i+1; //n[0]이 가장 큰 수라면 1번째 자리가 가장 큰 수.
			}	
		}
		System.out.println(max+"\n"+index);
		sc.close();
	}
}
