package sukkiri.lesson04.practice.practice04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//int型　要素数３の配列 numbersの用意 初期値は3, 4, 9
		int[] numbers = {3, 4, 9};
		//画面に「１桁の数字を入力してください」と表示、Scannerの用意
		Scanner sc = new Scanner(System.in);
		System.out.print("１桁の数字を入力してください：");
		//int inputにて入力をうけつけ
		int input = sc.nextInt();
		//for文を用意 numbersの要素の数だけループ
		/*		
				for(int i = 0; i < numbers.length; i++) {

					//numbersとinputが等しければアタリとする
					if(numbers[i] == input) {
						System.out.println("アタリ");
					}

				}
		 */
		
		
		for (int num: numbers) {
			if(num == input) {
				System.out.println("アタリ");
			}
		}

	}

}
