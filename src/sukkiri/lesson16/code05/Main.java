package sukkiri.lesson16.code05;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(); //自然順序
//		Set<String> words = new LiknedHashSet<String>(); //格納準
//		Set<String> words = new HashSet<String>();//順不同
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.print(s + "→");
		}
		
		for(int i =0; i < words.size(); i++) {
			///////???????????
			//インデックス番号がないのでこちらのfor文は使えない
		}
		
		

	}

}
