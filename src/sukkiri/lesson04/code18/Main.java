package sukkiri.lesson04.code18;

public class Main {

	public static void main(String[] args) {
		//２次元配列を生成
		int[][] scores = new int[2][3];
		//配列に要素を代入
		//(i)scores[0]に要素を代入
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		//↑scores[0] = {40,50, 60};といういイメージ
		//| scores[0][0] | scores[0][1] | scores[0][2] |
		//|      40      |      50      |      60      |

		//(ii)scores[1]に要素を代入
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;

		//↑scores[0] = {40,50, 60};といういイメージ
		//| scores[1][0] | scores[1][1] | scores[1][2] |
		//|      80      |      60      |      70      |


		//| scores[0][0] | scores[0][1] | scores[0][2] |
		//|      40      |      50      |      60      |
		//| scores[1][0] | scores[1][1] | scores[1][2] |
		//|      80      |      60      |      70      |


		System.out.println(scores[1][1]);
	}

}
