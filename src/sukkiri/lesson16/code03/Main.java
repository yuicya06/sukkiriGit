package sukkiri.lesson16.code03;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//HashSetのインスタンスの生成
		Set<String> colors = new HashSet<>();

		//要素の追加
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");//重複を許さないので、無視される

		System.out.println("色は" + colors.size() + "種類");
		
		//各要素を取得
		for(String s: colors) {
			System.out.println(s);
		}
	}

}
