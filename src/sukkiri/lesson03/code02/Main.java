package sukkiri.lesson03.code02;

public class Main {

	public static void main(String[] args) {
		/*
		boolean doorClose = false;
				while (doorClose == true) {
					System.out.println("ノックする");
					System.out.println("1分待つ");
				}

		 */
		int temp = 25;


		while(temp > 25) {
			temp--;
			System.out.println("=======================");
			System.out.println("温度を1度下げました");
			System.out.printf("ただいまの温度は%d度です\n", temp);
			System.out.println("温度を1度下げました");
			System.out.println("=======================");
		}


		do {
			temp--;
			System.out.println("=======================");
			System.out.println("温度を1度下げました");
			System.out.printf("ただいまの温度は%d度です\n", temp);
			System.out.println("=======================");
		} while(temp > 25);



		/*


		while(条件式) {
			処理
		}

		while(①) {
			処理
		}

		①の判定→true→ブロック内の処理→①の判定→もしfalseならブロックに
		入れずwhile文を抜ける


		 */
		
		

		
		
		
		
		
		
		
	}

}
