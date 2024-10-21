package sukkiri.practice.practice_print02.practice07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*入力受付*/
		Scanner sc = new Scanner(System.in);
		System.out.print("受験番号を入力:");
		int student_num = sc.nextInt();

		if(student_num >= 1000 && student_num <= 1500) {

			if(student_num == 1105 || student_num == 1200 || student_num == 1311) {//合格の場合
				System.out.printf("%d番は合格です。\n", student_num);
			} else {//不合格の場合
				System.out.printf("%d番は不合格です。\n", student_num);
			}

		} else {
			System.out.println("該当の受験番号は見つかりませんでした。");
		}

		sc.close();




	}

}
