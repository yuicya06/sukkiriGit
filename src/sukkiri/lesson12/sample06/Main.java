package sukkiri.lesson12.sample06;

public class Main {

	public static void main(String[] args) {
		
		/*12-10*/
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		
		for(Monster m : monsters) {
			m.run();
			
		}
		
		
		
		//もし１００体モンスターがいると、非常に下記の記述は
//		　したがって、上記12-10の書き方だと非常に楽
//		Slime s = new Slime();
//		Goblin g = new Goblin();
//		DeathBat d = new DeathBat();
//		
//		s.run();
//		g.run();
//		d.run();
		

	}

}
