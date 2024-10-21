package sukkiri.lesson15.code07;
//splitメソッド
public class Main {

	public static void main(String[] args) {
		
		
		String s = "abc,def:ghi";
		
		//split()で分割すると、配列が帰ってくる
		//[,;] 正規表現（,または; という意味）
		String[] words = s.split("[,:]");
		
		
		for (String w : words) {
			System.out.print(w + "->");
		}
	}

}
