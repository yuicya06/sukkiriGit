package sukkiri.lesson08.sample01;



//publicのクラスは1つだけ
public class Main {
	public static void main(String[] args) {

		//8-11
		//１．勇者を生成
		Hero h = new Hero();

		//8-12
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		
		
		
		//8-13
		//3.勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		//code8-16
		
		//お化けキノコAを生成し初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		//お化けキノコBを生成し初期化
		Matango m2 = new Matango();
		m2.hp = 50;
		m2.suffix = 'B';
		
		
		//冒険の始まり
		//h.slip();
		m1.run();
		m2.run();
		//h.run();
		
		

	}
}
