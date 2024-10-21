package sukkiri.lesson14.sample04;

public class Main {

	public static void main(String[] args) {
		
		
		   ////////////////////////////////////////////////////
		  ///インスタンスフォールドとスタティックフィールド///
		 ////////////////////////////////////////////////////
		
		
			/*書き方は クラス.静的フィールド名 とする*/
			
			/*NG h1.money*/
			/*OK Hero.meney*/
		
		
		/*14-10*/
//		Hero h1 = new Hero();
//		Hero h2 = new Hero();
//		System.out.println(h1.hp); 
//		System.out.println(Hero.money); 
		
		
		/*14‐11*/
//		Hero h1 = new Hero();
//		Hero h2 = new Hero();
//		Hero.money = 100;
//		System.out.println(Hero.money); 
//		System.out.println(h1.money);
//		h1.money = 300;
//		System.out.println(h2.money);
		
		/*14-12*/
		//一人も勇者を生み出していない状況で・・・(newなし)
		Hero.money = 100;
		System.out.println(Hero.money);

	}

}
