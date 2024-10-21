package sukkiri.lesson12.sample02;

public abstract class Character {
	
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		
	}
	
	//戦う
	public abstract void attack(Matango m);
	//public abstract void fireball(Matango m);

}
