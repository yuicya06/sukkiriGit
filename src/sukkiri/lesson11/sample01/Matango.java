package sukkiri.lesson11.sample01;

public class Matango {
	
	int hp;
	int level = 10; //8-6により書き換えられる
	//8-6
	final int LEVEL = 10;//再代入禁止
	
	//8-15
	char suffix;

	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した!");
	}


}
