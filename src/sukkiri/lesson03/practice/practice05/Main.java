package sukkiri.lesson03.practice.practice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("「[メニュー]」1:検索 2:登録 3:削除 4:変更＞");
		int selected = sc.nextInt();

		//		if (selected == 1) {
		//			System.out.println("検索します");
		//		} 
		//		else if (selected == 2) {
		//			System.out.println("登録します");
		//		}
		//		else if (selected == 3) {
		//			System.out.println("削除します");
		//		}
		//		else if (selected == 4) {
		//			System.out.println("変更します");
		//		} 

		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}


	}

}
