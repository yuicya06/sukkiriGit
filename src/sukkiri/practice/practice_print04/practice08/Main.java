package sukkiri.practice.practice_print04.practice08;

public class Main {

	public static void main(String[] args) {

		//以下の値を要素の値として持つ配列moji
		//あ	い	う	え	お

		char[] moji = {'あ', 'い', 'う', 'え', 'お'};

		//拡張for文を使って全ての値を表示
		for(char str: moji) {
			System.out.print(str);
		}
	}

}
