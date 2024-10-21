package sukkiri.lesson06.sample02;
//mainメソッドだけが残された Calc.java
public class Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = tasu(a, b);
		int delta = hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
