package sukkiri.lesson03.practice.practice03;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		int isHungry = rand.nextInt(2);	
		String food = "魚";
		System.out.println("こんにちは");
		
		//if文は外側をまずつくる
		
		if (isHungry == 0) {
			System.out.println("おなかがいっぱいです");
		} else {
			System.out.println("腹ぺこです");
		}
		
		if (isHungry == 1) {
			System.out.printf("%sをいただきます\n", food);
		}
			
		System.out.println("ごちそうさまでした");
		
	}

}
