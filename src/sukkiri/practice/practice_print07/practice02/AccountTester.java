package sukkiri.practice.practice_print07.practice02;

import java.util.Scanner;

//(4)AccountTesterに以下の処理を実装する
public class AccountTester {
	
	public static void main(String[] args) {
		

//		(4-1)要素数3個のAccount型クラスの配列を作成する（変数名はperson）
		Account[] person = new Account[3];
		
//		(4-2)口座作成の機能を以下の通りに作成する
//		1.要素数3に合わせてfor文を作り、内部処理として以下の2と3の処理を入れる。
//		2.口座名義、口座番号、預金額、口座作成年、口座作成月、口座作成日を順番にScannerを用いて値を入力できるようにする。
//		3.入力値をコンストラクタに渡し、Accountクラスのインスタンスを生成し、配列の要素に代入する。

		//2 scanner
		Scanner sc = new Scanner(System.in);
		
		String name;
		String num;
		int balance;
		int year;
		int month;
		int day;
		
		for(int i = 0; i< person.length; i++) {
			System.out.print("口座名義：");
			name = sc.nextLine();
			System.out.print("口座番号：");
			num = sc.nextLine();
			System.out.print("口座預金額：");
			balance = sc.nextInt();
			sc.nextLine();
			System.out.print("口座作成年：");
			year = sc.nextInt();
			//sc.nextLine();
			
			System.out.print("口座作成月：");
			month = sc.nextInt();
			//sc.nextLine();
			
			System.out.print("口座作成月：");
			day = sc.nextInt();
			sc.nextLine();
			
			person[i] = new Account(name, num, balance, year, month, day);
			
		}
		
		//System.out.println(person.length);

	
//		(4-3)配列personの中身を全件表示する
//		ループ文を用いて、Accountクラスの(3-3)で実装したshowAccountを呼び出す。
		for(int i = 0; i< person.length; i++) {
			person[i].showAccount();
		}
		
//		(4-4)person[0]のbalanceを1000加算する。
//		ヒント：Accountクラスのdepositメソッドを使う。
		person[0].deposit(1000);
	
//		(4-5)person[1]のbalanceを500減算する。
//		ヒント：Accountクラスのwithdrawメソッドを使う。
		person[1].withdraw(500);
		
		
//		(4-6)person[2]の口座作成日を「2000年10月20日」に変更する。
//		ヒント：AccountクラスのsetDayメソッドを使う。
		person[2].setDay(2000, 10, 20);
		
//		(4-7)person[0]のbalanceを表示する。
//		「〇〇の預金額は××です」という形にする。
//		ヒント：〇〇はAccountクラスのnameを呼び出すメソッド、××はbalanceを
//		呼び出すメソッドを使う。
		
		System.out.printf("%sの預金額は%dです\n", person[0].getName(), person[0].getBalance());
		
//		(4-8)person[1]のbalanceを表示する
//		「〇〇の預金額は××です」という形にする。
//		ヒント：〇〇はAccountクラスのnameを呼び出すメソッド、××はbalanceを
//		呼び出すメソッドを使う。
		
		System.out.printf("%sの預金額は%dです\n", person[1].getName(), person[1].getBalance());

//		(4-9)person[2]の口座作成日を表示する。
//		ヒント：person[2].Accountクラスのメソッド.Dayクラスのメソッドという風にして、
//		DayクラスのshowCreateDateメソッドまで繋げる。
//		
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日");
//		System.out.printf("口座作成日：%s",fmt.format(person[2].getDay()));
	
		//setDay(person[2].getYear(), person[2].getMonth(), person[2].getDay());
		
		
		
		//**********************************
		//.getDay()はAccountクラスのゲッターを呼び出してから
		//Dayクラスの.shoCreateDate()にアクセスしている
		person[2].getDay().showCreateDate();
		
	}

	
	






}
