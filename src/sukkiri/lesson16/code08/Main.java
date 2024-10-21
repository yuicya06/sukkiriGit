package sukkiri.lesson16.code08;

import java.util.ArrayList;
import java.util.List;

//Heroクラス
class Hero {

	//フィールド
	public String name;
}

//注意点 pubulic がついたクラスは１つしか定義できない
//Mainクラス
public class Main {
	public static void main(String[] args) {

		//インスタンスの生成（クラスをもとにしてつくられている）
		Hero minato = new Hero();
		//Hero型インスタンスminatoのフィールドnameに値をセット
		minato.name = "ミナト";
		System.out.println("minato.name：" + minato.name);

		///////////////////////
		////オブジェクト指向//
		/////////////////////

		/////////////////////////////
		////newはメモリ領域を確保///
		///////////////////////////

		//newするたびにHeroクラスが作られており、中にはnameがある
		Hero asaka = new Hero();
		//asaka.name = "あさか";
		System.out.println("asaka.name：" + asaka.name);

		System.out.println("minatoのアドレス" + minato);
		System.out.println("asakaのアドレス" + asaka);

		//Heroクラスのインスタンスであれば格納できる
		List<Hero> list = new ArrayList<Hero>();
		System.out.println("list：" + list); //アドレスはでてこない（確保はしている）

		//要素を追加（Heroインスタンスなら渡すことができる）
		//加えているのはアドレス
		list.add(minato);

		//minatoが返ってくるのでminato.nameになる
		System.out.println(list.get(0).name);

		//Hero型インスタンスminatoのフィールドnameに値を再セット
		minato.name = "スガワラ";
		//表示
		//minatoが返ってくるのでminato.nameになる
		System.out.println(list.get(0).name);
	}

}
