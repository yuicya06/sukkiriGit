package sukkiri.lesson10.sample03;

public class SuperHero extends Hero {
	
	//10-9
	@Override
	public void attack(Matango m) {
		//親クラスのattack()を呼び出す
		super.attack(m);
		//this 自分の boolean flyingがtrueなら
		if(this.flying) {
			super.attack(m);
		}
	}
	
	
	
	
	
	
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
		
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
		
	}
	
	@Override
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	
	/*	
	 * public final void slip() {
			this.hp -= 5;
			System.out.println(this.name + "は転んだ！");
			System.out.println("5のダメージ");
			
		}
		
		*/


}
