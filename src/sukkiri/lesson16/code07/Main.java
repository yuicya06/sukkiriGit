package sukkiri.lesson16.code07;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();

		//key部分はおそらくsetで保管されているので、順番の概念がないの
		//通常のfor文は対応しないので、拡張for文で対応
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);

		//prefs.keySet()の部分はSetが返ってくる
					    //Set<String> set
		for (String key : prefs.keySet()) {//keySetメソッド：Mapのkeyを要素とするSetを返す
			int value = prefs.get(key);//keyに対応するvalueを返すgetメソッド・
			System.out.println(key + "の人口は、" + value);
			
			
		}
	}

}
