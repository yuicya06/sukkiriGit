package sukkiri.lesson13.sample02;

public class King {
	
	 public void talk(Hero h) {
		 	
		 	//privateなのでアクセルできない
		 	//System.out.println("王様：ようこそ我が国へ、勇者" + h.name + "よ。");
		 	//13-9
		 	//getterメソッドを使ってアクセス
		    System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");
		 
		    System.out.println("王様：長旅疲れたであろう。");
		    System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう。");
		    h.bye();
		    
		    System.out.println("勇者のHPは"+ h.getHp() +"だ！");
		    
		  }

}
