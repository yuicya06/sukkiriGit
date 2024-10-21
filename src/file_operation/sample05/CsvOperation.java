package file_operation.sample05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//・フィールド
//アクセス修飾子はprivateで、ファイルパスを格納する定数filepathを宣言
//・コンストラクタ
//定数filepathに「file\\AnimalData.txt」を代入
//・メソッド
//CsvFileReaderメソッド
//　：引数なしで、戻り値はAnimal型ArrayList。
//	Animal型ArrayListインスタンスを生成する。
//	AnimalData.txtの内容を1行ずつ読み取り、各行「,」で分割後、
//Animalクラスのコンストラクタに渡し、インスタンスを生成し、それをAnimal型ArrayListインスタンスに加え、それを返す。

public class CsvOperation {

	private final String filepath;

	public CsvOperation() {
		this.filepath = "file\\AnimalData.txt";
	}

	/*method*/
	public ArrayList<Animal> CsvFileReader() {

		ArrayList<Animal> list = new ArrayList<>();

		//String filepath = "file\\AnimalData.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filepath));) {

			String line;
			// ファイルを1 行読み込み、データがある間繰り返す
			//whileの中身をアレンジしていく
			while ((line = br.readLine()) != null) {
				//lineの分割 「,」区切りで分割

				String[] str = line.split(",");
				//上記の配列からアニマル型インスタンス生成
				
				String name = str[0];
				String kind = str[1];
				int age = Integer.parseInt(str[2]);
				
				Animal animal = new Animal(name, kind, age);
				//new Animal(str[0], str[1], Integer.parseInt(str[2])));
				
				list.add(animal);

				//lineの格納

			}
		} catch (IOException ex) {
			// IOException の例外処理
			ex.printStackTrace();

		}

		return list;

	}

}
