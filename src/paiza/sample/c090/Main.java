package paiza.sample.c090;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] num = str.split("");
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			switch (num[i]) {

			case "0":
				count += 24;
				break;
			case "1":
				count += 6;
				break;

			case "2":
				count += 8;
				break;
			case "3":
				count += 10;
				break;
			case "4":
				count += 12;
				break;
			case "5":
				count += 14;
				break;
			case "6":
				count += 16;
				break;
			case "7":
				count += 18;
				break;
			case "8":
				count += 20;
				break;
			case "9":
				count += 22;
				break;
			case "-":
				break;

			}

		}
		
		System.out.println(count);

	}

}
