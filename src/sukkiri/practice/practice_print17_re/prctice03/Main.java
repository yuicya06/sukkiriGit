package sukkiri.practice.practice_print17_re.prctice03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("整数を入力してください。");
			String str = sc.nextLine();
			int num = Integer.parseInt(str);
			System.out.println("入力された整数は" + num + "です。");
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			System.out.println("整数値ではない");

		}

	}

}
