package paiza.sample.c015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		for (int i = 0; i < n; i++) {

			String s = sc.next();
			int p = sc.nextInt();
			if (s.contains("3")) {

				total += p * 0.03;

			}

			else if (s.contains("5")) {
				
				total += p * 0.05;

			} else {
				
				total += p * 0.01;
			}
			
			
			
			

			sc.nextLine();

		}
		
		
		System.out.println(total);

	}

}
