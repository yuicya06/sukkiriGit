package sukkiri.practice.practice_print14.practice06;

//●Mainクラス
//・メソッド
//　　mainメソッド
//　　　：ユーザーの総数を表示する。
//　　　　「Alice」、「Bob」、「Charlie」をそれぞれコンストラクタに渡し、
//    Userクラスのインスタンスを生成する。
//　　　　生成した各インスタンスの情報を表示する。
//　　　　再度、ユーザーの総数を表示する。


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Total users:" + User.getUserCount());
		System.out.println("------------------");
		
		User user1 = new User("Alice");
		User user2 = new User("Bob");
		User user3 = new User("Charlie");
		
		user1.displayUserInfo();
		user2.displayUserInfo();
		user3.displayUserInfo();
		
		System.out.println("------------------");
		System.out.println("Total users:" + User.getUserCount());
		
//		int[]  a = new int[2];
//		System.out.println(a[2]);

	}

}
