package sukkiri.lesson05.code04;

public class Main {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");

//		hello_minato();
//		hello_asaka();
//		hello_sugawara();
	}


	//helloメソッドの定義
	//引数の書き方
	//public static void メソッド名（型 ブロック内で使う変数名）

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	
	
//	public static void hello_minato() {
//		System.out.println("hello, minato");
//	}
//	public static void hello_asaka() {
//		System.out.println("hello, asaka");
//	}
//	public static void hello_sugawara() {
//		System.out.println("hello, sugawara");
//	}


}
