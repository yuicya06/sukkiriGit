package sukkiri.lesson05.code09;

public class Main {

	public static void main(String[] args) {

		System.out.println(sample());

	}

	//return文の注意点！return文は値を戻すだけでなく、メソッドの終了も行う
	public static int sample() {
		return 1;//ここで上のメソッドに戻る
		//int x = 10;　エラー　到達不能
	}

	public static int aaa(int x) {
		if (x > 0) {
			return x;
		}
		return -x;
	}

	public static int bbb(int x) {
		if (x > 1) {
			return 3;
		} else if (x > 0) {
			return 1;
		}
		//else if 以降の処理が書かれてないのでエラーが出る
		//else などで、戻り値をが絶対にあるようにする
		else {
			return -x;
		}

		//return x;エラー　到達不能

	}

}
