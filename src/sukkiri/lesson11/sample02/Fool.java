package sukkiri.lesson11.sample02;

//全ての抽象メソッドを継承した
//implements: interfaceで実装されている抽象メソッドを全て実装する
//クラスの継承、interfaceの実装
public class Fool extends Character implements Human {
	
	//Characterからhpやnameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装
	
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");		
	}	
	
	//さらにHumanから継承した４つの抽象メソッドを実装
	public void talk() {
		System.out.println(this.name + "は話す");
	}
	
	public void watch() {
		System.out.println(this.name + "は見る");
	}
	
	public void hear() {
		System.out.println(this.name + "は聞く");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げる");
	}



}
