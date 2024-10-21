package sukkiri.practice.practice_print16.practice03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	//	問3	【HashMapの操作】
	//	下記表は東京の過去5年の１２月の平均気温です。
	//	HashMap＜String,String＞で宣言し、下記のデータをキーボードから入力し、Mapに追加していってください。
	// （入力は、年と気温を一行で入力し、半角スペースで区切ってください。）
	//	次に、Mapのキーを全件表示してください。
	//	最後にキーボードから表示したい年を入力し、その入力されたものがMapのキーと一致した場合、気温を表示するプログラムを作成しましょう。
	//	ヒント：for文で入力後、半角スペースでsplitし配列に格納後、インデックス０に年、インデックス１に気温がString型で格納されるので、それをMapにputして追加する。
	//
	//	2021年	2020年	2019年	2018年	2017年
	//	7.9℃	7.7℃	8.5℃	8.3℃	6.6℃

	//	実行結果例
	//	2021年 7.9℃（入力）
	//	2020年 7.7℃（入力）
	//	2019年 8.5℃（入力）
	//	2018年 8.3℃（入力）
	//	2017年 6.6℃（入力）
	//	2021年（表示）
	//	2017年（表示）
	//	2018年（表示）
	//	2019年（表示）
	//	2020年（表示）
	//	表示したい年を入力してください。（表示）
	//	2019年（入力）
	//	8.5℃（表示）

	public static void main(String[] args) {
		//		HashMap＜String,String＞で宣言
		//<第1型パラメーター,第2型パラメーター>
		Map<String, String> aveg = new HashMap();
		//	    下記のデータをキーボードから入力し、Mapに追加
		//		2021年	2020年	2019年	2018年	2017年
		//		7.9℃	7.7℃	8.5℃	8.3℃	6.6℃
		Scanner sc = new Scanner(System.in);

		//		入力は、年と気温を一行で入力し、半角スペースで区切って

		//年
		System.out.print("入力（年）：");
		String x = sc.nextLine();
		String[] age = x.split("	");

		//気温
		System.out.print("入力（気温）：");
		String y = sc.nextLine();
		String[] temp = y.split("	");

		//System.out.println(temp[0]);

		//		Mapに追加
		for (int i = 0; i < 5; i++) {

			aveg.put(age[i], temp[i]);

		}

		//次に、Mapのキーを全件表示してください。
		//keySet()セット型を返す（ただしSetなので順序は考慮しない）
		for (String key : aveg.keySet()) {
			System.out.println(key);

		}

		//表示したい年を入力してください。
		System.out.print("表示したい年を入力してください。：");
		String z = sc.nextLine();

		System.out.println(aveg.get(z));

	}

}
