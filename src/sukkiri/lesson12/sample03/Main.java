package sukkiri.lesson12.sample03;

public class Main {

	public static void main(String[] args) {
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		
		//親の箱に入れた場合
		//親のクラスにあるから呼び出せて、（箱の中身の）
		//オーバライドしたメソッドを呼ぶ
		m.run();
		
		
		double d = 3.0;
		int i  = (int)d;
	}

}
