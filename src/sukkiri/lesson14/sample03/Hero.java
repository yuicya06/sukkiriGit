package sukkiri.lesson14.sample03;

public class Hero {

	String name;
	int hp;
	
	static int money;

	/*14-5*/
	//	Objectクラスの中にtoString()があるので再定義
//	@Override
//	public String toString() {
//		return "名前：" + this.name + " / HP : " + this.hp;
//	}

	/*14-7*/
	@Override
	public boolean equals(Object o) {
		//this は h1(自分の)のアドレス oは h2
		System.out.println("o:" + o);
		if (this == o) { //h1 == h2
			return true;
		}
		
		System.out.println("a");
		
		/////////////////////////////////////
		//引数で受け取ったObject型の値はそのままだと比較できない
		//ので、Hero型にダウンキャストして、equals()で比較できるようにする
		if (o instanceof Hero h) {	//ダウンキャスト（例外：class...exception
			System.out.println("b");
			
			if (this.name.equals(h.name)) { //h1.name.equals(h2.name)
				System.out.println("c");
				return true;
			}
		}
		
		System.out.println("d");
		return false;
		/*
		//エラー
		if(this.name.equals(o.name) {
			
		}
		*/
		///////////////////////////////////
		
		
		//objectクラスのフィールドにはnameはない（エラー）
//		if(this.name.equls(o.name)) {
//			System.out.println("c");
//			return true;
//		}
		
	}

}
