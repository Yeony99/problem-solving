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
				index=i+1; //n[0]�� ���� ū ����� 1��° �ڸ��� ���� ū ��.
			}	
		}
		System.out.println(max+"\n"+index);
		sc.close();
	}
}
