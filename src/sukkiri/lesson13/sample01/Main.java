package sukkiri.lesson13.sample01;

public class Main {

	public static void main(String[] args) {
		
		//インスタンス生成
		Hero hero = new Hero();
		Matango m = new Matango();
		
		
		//heroに名前、hpを設定
		hero.name = "勇者";
				
		hero.bye();
		hero.sleep();
		hero.attack(m);
				
		//heroインスタンスのdieメソッドを呼び出し
		hero.die();
				
		//heroインスタンスのフィールドhpにアクセス
		hero.hp = 2;

	}

}
