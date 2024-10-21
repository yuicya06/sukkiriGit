package sukkiri.lesson12.sample01;

//11-8 12-1
public abstract class Character implements Life{
	
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		
	}
	
	//戦う
	
	public abstract void attack(Matango m);

}
