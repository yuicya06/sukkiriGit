package sukkiri.lesson05.practice.practice03;

public class Main {

	public static void email(String address, String title,  String text) {

		System.out.printf("%sに、以下のメールを送信しました\n", address);
		System.out.printf("件名:%s\n", title);
		System.out.printf("本文:%s\n", text);

	}
	
	/**
	 * オーバーロード
	 * email
	 * 戻り値：なし
	 * 引数 String adress, String text
	 * 処理：adressさんに、以下のメールを送信しました
			 件名:無題
			 本文:text
	 */

	public static void email(String address, String text) {

		System.out.printf("%sに、以下のメールを送信しました\n", address);
		System.out.printf("件名:無題\n");
		System.out.printf("本文:%s\n", text);

	}

	public static void main(String[] args) {

		email("yxxxxx@gmai.com", "メールの本文");
	}

}
