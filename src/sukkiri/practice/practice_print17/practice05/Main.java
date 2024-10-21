package sukkiri.practice.practice_print17.practice05;

import java.util.Scanner;

//●Mainクラス
//キーボードからidとnameを入力します。
//idが負の場合、nameが空の場合は再度入力するようにしてください。
//	正しく設定された場合は、toStringを使用して設定された値を表示する。

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("name: ");
			String name = sc.nextLine();

			try {
				User user = new User(id, name);
				System.out.println(user.toString());
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}
}
