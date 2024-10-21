package sukkiri.practice.practice_print03.practice09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力値＞");
		int n = sc.nextInt();

		int sum = 0;
		/*
				for(int i = 1; i <= n; i++) {
					if(i > 0 && i % 2 ==0 ) {
						sum += i;
					}

				}
		 */
		int i = 1;

		while(i <= n) {

			if(i > 0 && i % 2 == 0) {

				sum += i;
			}
			i++;
		}
		System.out.println(sum);






	}

}
