package sukkiri.lesson12.sample03;

public abstract class Monster {
	
	//抽象メソッドが無くても抽象クラスにできる
	//抽象クラスを持つと必ず抽象クラスになる
	public void run() {
		System.out.println("モンスターは逃げ出した。");
	}

}
