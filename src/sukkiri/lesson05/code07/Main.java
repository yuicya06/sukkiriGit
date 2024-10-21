package sukkiri.lesson05.code07;

public class Main {

	//戻り値があるaddメソッド
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;	//整数2つを受け取って、足し算した結果を返してる
	}

	public static void main(String[] args) {
		
		//戻り値があるメソッドは、必ず変数に代入
		int ans = add(100, 10);
		
		//System.out.println("100 + 10 =" + ans);
	}

}
