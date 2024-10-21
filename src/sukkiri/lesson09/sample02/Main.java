package sukkiri.lesson09.sample02;

public class Main {

	public static void main(String[] args) {
		//9-4
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		
	
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;//上で作ったSwordインスタンスの変数しか代入できない
		System.out.println("現在の武器は" + h.sword.name);//
		System.out.println(h.sword.damage);//heroクラスはSword型の変数を持っていてその中のdamageにアクセス

	}

}
