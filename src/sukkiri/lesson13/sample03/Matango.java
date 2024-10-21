package sukkiri.lesson13.sample03;

//Matango.java とpuclic class Matango
//クラスメイトとソース名は同一


public class Matango {
	
	int hp;
	final int LEVEL = 10;
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}



//非publicクラス
//一つのファイルにpublicクラスは１つまで
class Dragon{
	
}
class Bat{
	
}
class Slime{
	
}
