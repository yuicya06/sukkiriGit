package sukkiri.practice.practice_print17_re.prctice04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			try {
				System.out.println("整数を入力してください。");
				String str = sc.nextLine();
				num = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("整数値ではない");
				
			}
		}

		System.out.println("入力された整数は" + num + "です。");

	}

}
