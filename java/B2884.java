package step1;

import java.util.Scanner;

public class B2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H, M;

		H = sc.nextInt();
		M = sc.nextInt();

		if (M < 45) { // 45분보다 작으면
			H--; // 시간에서 1시간을 빼야한다
			M = 60 - (45 - M); // H--; 했으니 M이 60분을 가지고, (45-M) 값을 뺀다.
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			M = M - 45;
			System.out.println(H + " " + M);
		}

		sc.close();
	}
}
