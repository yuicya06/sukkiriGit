package sukkiri.lesson15.code08;

public class Main {

	public static void main(String[] args) {
		
		String s = "abc,def:ghi";
		
		//[] 正規表現
		//[beh] :b、またはe、または,hをXに書き換える
		String w = s.replaceAll("[beh]", "X");
		
		System.out.println(w);
	}

}
