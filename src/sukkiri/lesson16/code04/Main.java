package sukkiri.lesson16.code04;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//要素を取り出す順番は考慮されていない
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		for (String s : colors) {
			System.out.print(s + "→");
		}

	}

}
