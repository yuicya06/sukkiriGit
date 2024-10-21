package sukkiri.lesson03.code04;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		Random rand = new Random();
		int fortune = rand.nextInt(4) + 1;
		System.out.println("fotune" + fortune);
		System.out.println("=====if=====");
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}
		
		
		System.out.println("=====switch=====");
		switch (fortune) {
		case 1 -> {
			System.out.println("大吉");
		}
		case 2 -> {
			System.out.println("吉");
		}
		case 3 ->{
			System.out.println("吉");
		}
		default -> {
			System.out.println("凶");
		}
		}

	}

}
