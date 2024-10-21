package sukkiri.lesson12.sample05;


public abstract class Character {
	
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		
	}
	
	//戦う
	
	//もし具体的な型だとHeroクラスにオーバーライドさせないといけない
//	public abstract void attack(Slime s);
//	public abstract void attack(Goblin g);
	
	
	public abstract void attack(Monster m);
	
	

}
