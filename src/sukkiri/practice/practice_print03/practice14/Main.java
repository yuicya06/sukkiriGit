package sukkiri.practice.practice_print03.practice14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("入力：");
		int input  = sc.nextInt();

		/*	for(int i = 0; i < n; i++) {
					for(int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
		 */	


		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}




	}

}
