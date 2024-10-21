package sukkiri.lesson12.sample05;

public class Main {
	public static void main(String[] args) {
		Character h = new Hero();
		h.name = "勇者";
		Monster slime = new Slime();
		Monster goblin = new Goblin();
		
		h.attack(slime);
		h.attack(goblin);
		
	}
}
