package sukkiri.lesson05.practice.practice02;

public class Main {


	/**
	 * email
	 * 戻り値：なし
	 * 引数 String title, String adress, String text
	 * 処理：adressさんに、以下のメールを送信しました
			 件名:title
			 本文:text
	 */

	public static void email(String address, String title,  String text) {

		System.out.printf("%sに、以下のメールを送信しました\n", address);
		System.out.printf("件名:%s\n", title);
		System.out.printf("本文:%s\n", text);

	}

	public static void main(String[] args) {
		
		String title;
		String address;
		String text;
		
		
		email("メールの宛先アドレス", "メールのタイトル", "メールの本文");
	}

}
