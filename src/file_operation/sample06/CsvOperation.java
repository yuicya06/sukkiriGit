package file_operation.sample06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


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
	
	
	/*method オーバーロード*/
	
	public ArrayList<Animal> CsvFileReader(String filepath){
		filepath = "";
		
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
	
	
	
	public int CsvFilewriter(ArrayList<Animal> list, String filepath) {
		
		int count;
		
		
		try ( //FileWriter fw = new FileWriter(filepath);

				//BufferedWriter bw = new BufferedWriter(fw);

				BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true));

		)

		{
			// 書き込みを繰り返す
//			for (int i = 0; i < 5; i++) {
//				bw.write("[" + i + "]"); // ファイルに書き込み
//				bw.newLine(); // 改行
//			}
			CsvFileReader();
			
			for(Animal animal : list) {
				
				bw.write("");
			}
			
			
		} catch (IOException e) {
			// IOException の例外処理
			e.printStackTrace();
		}
		
		
		
		
		return 0;
	}
	
	
	

}
