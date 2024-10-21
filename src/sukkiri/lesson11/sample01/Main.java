package sukkiri.lesson11.sample01;

public class Main {

	public static void main(String[] args) {
		//Character c = new Character();
		Dancer d = new Dancer();
		d.name = "ダンサー";
		Matango m = new Matango();
		d.attack(m);
		Soldier s = new Soldier();
		s.name = "戦士";
		s.attack(m);
	}

}
