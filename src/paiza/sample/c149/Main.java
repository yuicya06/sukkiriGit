package paiza.sample.c149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String sw = sc.nextLine();
		String[] s = sw.split("");

		for (int i = 0; i < s.length; i++) {

			if (s[i].contains(str)) {

				System.out.print(s[i]);

			}

			if (!(str.contains(s[i]))) {

				if (s[i].toLowerCase().contains(str)) {
					System.out.print(s[i].toLowerCase());
				} else if (s[i].toUpperCase().contains(str)) {

					System.out.print(s[i].toUpperCase());
				}

			}

		}
		System.out.println();
	}

}
