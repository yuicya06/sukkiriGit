package sukkiri.practice.practice_print02.practice08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("受験番号を入力:");
		int student_num = sc.nextInt();

		switch(student_num) {

		case 1105 -> {
			System.out.printf("%d番は合格です。\n", student_num);
		}
		case 1200 -> {
			System.out.printf("%d番は合格です。\n", student_num);
		}
		case 1311 -> {
			System.out.printf("%d番は合格です。\n", student_num);
		}
		default -> {
			System.out.printf("%d番は不合格です。\n", student_num);
		}


//		case 1105, 1200, 1311 ->{
//			System.out.printf("%d番は合格です。\n", student_num);
//		}
//		
		
		
		
		
		
		
		
		}
		//		if(student_num >= 1000 && student_num <= 1500) {
		//
		//			if(student_num == 1105 || student_num == 1200 || student_num == 1311) {
		//				System.out.printf("%d番は合格です。\n", student_num);
		//			} else {
		//				System.out.printf("%d番は不合格です。\n", student_num);
		//			}
		//
		//
		//
		//
		//		} else {
		//			System.out.println("該当の受験番号は見つかりませんでした。");
		//		}

		sc.close();




	}

}