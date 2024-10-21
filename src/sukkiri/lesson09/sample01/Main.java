package sukkiri.lesson09.sample01;

public class Main {
	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		System.out.println("h1" + h1);
		
				h1.hp = 100;
				
				Hero h2;
				h2 = h1;//メモリアドレス@279f2327を代入
				System.out.println("h2:" + h2); 
				
				
		
		
				h2.hp = 200;//h2がh1と同じフィールドのアドレス
							//なのでh1のアドレスのフィールドに200が代入される
				System.out.println(h1.hp);
				
				
				
		/**/
	}

}
