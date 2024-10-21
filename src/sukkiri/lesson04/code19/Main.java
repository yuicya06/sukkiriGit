package sukkiri.lesson04.code19;

public class Main {

	public static void main(String[] args) {


		int[][] scores = {{40, 50, 60}, {80, 60, 70}};//外側｛親配列｝内側{子配列}｛子配列｝
		System.out.println(scores.length);//親配列の要素数:2
		System.out.println(scores[0].length);//１つ目の子配列の要素数:3　｛40, 50, 60｝

		//| scores[0][0] | scores[0][1] | scores[0][2] |
		//|      40      |      50      |      60      |
		//| scores[1][0] | scores[1][1] | scores[1][2] |
		//|      80      |      60      |      70      |


		int[][] scoresB = {{40, 50, 60}, { 60, 70, 80, 90, 100}, {10, 20}};
		System.out.println("scoresBの要素数" + scoresB.length);
		System.out.println("scoresB[0]の要素数" + scoresB[0].length);
		System.out.println("scoresB[1]の要素数" + scoresB[1].length);
		System.out.println("scoresB[2]の要素数" + scoresB[2].length);


		//| scores[0][0] | scores[0][1] | scores[0][2] |
		//|      40      |      50      |      60      |
		//| scores[1][0] | scores[1][1] | scores[1][2] | scores[1][3] | scores[1][4] |
		//|      60      |      70      |      80      |      90      |      100     |
		//| scores[2][0] | scores[2][1] |
		//|      80      |      60      |


		System.out.println("==============================");

		for (int i = 0; i < scoresB.length; i++) {
			for (int j = 0; j < scoresB[i].length; j++) {
				System.out.print(scoresB[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}



	}

}
