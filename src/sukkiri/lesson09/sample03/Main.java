package sukkiri.lesson09.sample03;

public class Main {

	public static void main(String[] args) {
		//9-6
		//Heroクラスのインスタンスを2つ生成
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 1000;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		//Wizardインスタンスのインスタンスメソッドを呼び出している
		w.heal(h1); //ミナトを回復させる（HP: 100 → 110）
		System.out.println("h1.hp="+h1.hp);
		w.heal(h2); //ミナトを回復させる（HP: 100 → 110）
		System.out.println("h2.hp="+h2.hp);
		w.heal(h2); //ミナトを回復させる（HP: 100 → 120）
		System.out.println("h2.hp="+h2.hp);
		
		
		//staticメソッド（インスタンス不要）
		Wizard.aaa();

	}

}
