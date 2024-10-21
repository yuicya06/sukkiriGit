package sukkiri.lesson16.code02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//ArrayListの生成
		//ArrayList<String> names = new ArrayList<String>();
		List<String> names = new ArrayList<>();

		//ArrayListに要素を格納
		names.add("湊");
		names.add("朝香");
		names.add("菅原");

		//Iteratorの生成
		Iterator<String> it = names.iterator();
		//while文で各要素を見ていく
		while (it.hasNext()) {
			String e = it.next();// next()で次の要素を取得
			System.out.println(e);
		}

		// |    0   |    2   |    3   |
		// |   湊   |  浅香　|   菅原 |　　
		//↑0より手前からスタート

		printList(names);

		LinkedList<String> linked = new LinkedList<>();
		List<String> linked2 = new LinkedList<>();

		printList(linked);
		printList(linked2);

	}

	public static void printList(Collection<String> list) {
		//ArryListにすると、受けがちいさいのでエラーになる
		//ListだとArrayListとLinkedListの両方をカバーしてくれる
		//さらに上位のCollectionにすることもできる

	}

}
