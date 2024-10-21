package sukkiri.lesson11.sample01;

public class Dancer extends Character{
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	
	
	/*Characterクラスのメソッドを全て実装したので
	Dancerクラスはabstractを付けなくてよい*/
	//11-10
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメ‐ジ");
		m.hp -=3;
	}


	

}
