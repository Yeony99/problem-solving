package step1;

import java.util.Scanner;

public class B2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H, M;

		H = sc.nextInt();
		M = sc.nextInt();

		if (M < 45) { // 45�к��� ������
			H--; // �ð����� 1�ð��� �����Ѵ�
			M = 60 - (45 - M); // H--; ������ M�� 60���� ������, (45-M) ���� ����.
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
