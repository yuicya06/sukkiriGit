package sukkiri.lesson04.code17;

public class Main {

	public static void main(String[] args) {
		//配列（参照型）
		int[] array = {1, 2, 3};
		
		System.out.println("array:" + array);
		
		System.out.println("-----null代入後-----");
		//配列変数にnullを代入
		array = null;
		
		System.out.println("array:" + array); // どこも参照していない
		
		System.out.println("-----array[0]に代入-----");
		
		array[0] = 10; //エラー
		
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		//System.out.println(array[2]);
	}

}
