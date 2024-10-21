package sukkiri.lesson12.sample01;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = new Wizard();
		Life l = new Wizard();
		
		w.attack(null);//
		c.attack(null);//Characterの箱にattack(Matango m)
		//l.attack(null);//Lifeの箱にはattack()は定義されていない
		
		
	}

}
