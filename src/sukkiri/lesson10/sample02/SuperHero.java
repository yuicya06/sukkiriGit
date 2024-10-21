package sukkiri.lesson10.sample02;

//10-3
public class SuperHero  extends Hero{
	
	/*差分フィールド*/
	boolean flying;
	
	/*差分メソッド*/
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
		
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
		
	}
	//10-5　runメソッドをOverride
	@Override
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

}
