package sukkiri.lesson04.code05;

public class Main {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[5];


		scores[0] = 30; //添え字が0の箱に30代入
		scores[1] = 50;
		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);

		//   |scores[0]  |scores[1] | 
		//	 |	 30      |  50      |

		scores[3] = 100;
		System.out.println("scores[3]" + scores[3]);
	}

}
