package sukkiri.lesson12.sample02;

public class Main {

	public static void main(String[] args) {
		
		/*12-3*/
//		Wizard w = new Wizard();
//		Matango m = new Matango();
//		w.name = "アサカ";
//		w.attack(m);
//		w.fireball(m);
		
		//親クラス型変数に代入
		/*12-4 エラー*/
		Wizard w = new Wizard();
		Character c = w;
		Matango m = new Matango();
		c.name = "アサカ";
		c.attack(m);
		c.fireball(m);
		
		
	}

}
