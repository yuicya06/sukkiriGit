package sukkiri.lesson11.sample01;

public class Soldier extends Character {
	
	
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメ‐ジ");
		m.hp -=3;
	}


}
