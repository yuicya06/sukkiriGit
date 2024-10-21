package sukkiri.lesson03.code09;

public class Main {

	public static void main(String[] args) {
		/*for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j); //掛け算の結果
				System.out.print(" ");//空白
			}
			System.out.println("");//改行
		}*/
		
		System.out.println("=============break文　continue文=============");
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
