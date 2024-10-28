package paiza.sample.c014;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt() * 2;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {

				int box = sc.nextInt();

				if (r <= box) {
					count++;

				}

			}

			if (count == 3) {
				System.out.println(i + 1);
			}

			count = 0;
		}

	}

}
