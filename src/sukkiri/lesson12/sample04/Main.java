package sukkiri.lesson12.sample04;

public class Main {

	public static void main(String[] args) {
		
		/*12-6*/ //一つづつ更新しないとダメ
//		Hero h1 = new Hero();
//		Hero h2 = new Hero();
//		Thief t1 = new Thief();
//		Wizard w1 = new Wizard();
//		Wizard w2 = new Wizard();
//		
//		//冒険開始！
//		//まず宿屋に泊まる
//		
//		h1.hp += 50;
//		h2.hp += 50;
//		t1.hp += 50;
//		w1.hp += 50;
//		w2.hp += 50;
		
		/*12-7*/ //親クラス型変数に代入することにより、まとめて管理できる
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		//宿屋に泊まる
		for(Character ch : c) {
			ch.hp += 50;
			System.out.println(ch.hp);
		}

	}

}
