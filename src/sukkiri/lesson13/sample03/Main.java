package sukkiri.lesson13.sample03;

public class Main {

	public static void main(String[] args) {
		
		Hero minato = new Hero();
		minato.setName("minato");
		System.out.println(minato.getName());
		
		System.out.println("-------------");
		
		//エラー
		Hero h = new Hero();
		h.setName("");
		System.out.println(h.getName());

	}

}
