package step1;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		A=Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		//���ڿ� �������� �����ϴµ�, StringBuilder()�� A�� �ְ�, �� ���� �����, Integer���� ���ڿ��� ��ȯ.
		B=Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.println(A>B?A:B);
	}
}