package sukkiri.lesson05.code02;

public class Main {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		//hello();//→メソッドが定義されているところにワープ
		System.out.println("メソッドの呼び出しが終わりました");
		
		hello();
		hello();
		hello();
	}
	//helloメソッド
	public static void hello() {
		System.out.println("湊さん、こんにちは");
	}

}
