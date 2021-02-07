package step1;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		A=Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		//문자열 형식으로 저장하는데, StringBuilder()에 A를 넣고, 그 값을 뒤집어서, Integer형을 문자열로 변환.
		B=Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.println(A>B?A:B);
	}
}