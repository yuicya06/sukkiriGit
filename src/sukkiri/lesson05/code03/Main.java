package sukkiri.lesson05.code03;

public class Main {

	//methodAメソッド（次点）
	public static void methodA() {
		System.out.println("methodA");
		System.out.println("before calling methodB method");
		methodB();
		System.out.println("after calling methodB method");
	}
	
	//methodBメソッド（次々点）
	public static void methodB() {
		System.out.println("methodB");
	}


	//mainメソッド（起点）
	public static void main(String[] args) {
		System.out.println("before calling methodA method");
		methodA();
		System.out.println("after calling methodA method");
	}
}
