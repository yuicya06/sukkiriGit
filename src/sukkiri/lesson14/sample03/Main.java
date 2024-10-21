package sukkiri.lesson14.sample03;

public class Main {

	public static void main(String[] args) {
		/*14-4*/
//		Hero h = new Hero();
//		h.name = "ミナト";
//		h.hp = 100;
//		
//		System.out.println(h.toString());
		
		/*14-6*/
		/*一人目の勇者*/
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		/*二人目の勇者*/
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		
		
		/*3人目の勇者*/
		Hero h3 = new Hero();
		h3.name = "アサカ";
		h3.hp = 100;
		
		
		   ////////////////////////////////////////////////////
		  ///インスタンスフォールドとスタティックフィールド///
		 ////////////////////////////////////////////////////
		
		
			/*書き方は クラス.静的フィールド名 とする*/
			
			/*NG h1.money*/
			/*OK Hero.meney*/
		
		h1.money = 1023;
		System.out.println("h.money:" + h1.money);
		System.out.println("h.money:" + h2.money); //同じ値が出て来る(設定していないのに/staticなフィールドは共通で使用される)
		System.out.println("h.money:" + h3.money); //同じ値が出て来る
		
		h3.money = 9999;
		System.out.println("h.money:" + h1.money);
		System.out.println("h.money:" + h2.money);
		System.out.println("h.money:" + h3.money);
		
		
		
//		h2 = h1; //同じアドレスとなる
		
		
			System.out.println("h1:" + h1);
			System.out.println("h2:" + h2);
			System.out.println("h3:" + h3);
		
		if(h1.equals(h3)) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		/*
		if(h1 == h2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}*/
		
		
		class Empty {
			String name = "ミナト";
			
		}
		
		Empty empty = new Empty();
		
		if (h1.equals(empty)) {
			System.out.println("同じ内容です");
		}
		System.out.println("違う内容です");
		
		
		
		
		

	}

}
