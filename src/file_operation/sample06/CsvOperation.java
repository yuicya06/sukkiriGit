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

	public ArrayList<Animal> CsvFileReader() {

		ArrayList<Animal> animal = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filepath));) {

			String line;
			while ((line = br.readLine()) != null) {

				String[] str = new String[3];
				str = line.split(",");
				animal.add(new Animal(str[0], str[1], str[2]));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return animal;

	}

	/*Overlord*/
	public ArrayList<Animal> CsvFileReader(String filepath) {

		ArrayList<Animal> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filepath));) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] str = new String[3];
				str = line.split(",");
				list.add(new Animal(str[0], str[1], str[2]));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

	/*WriterMethod*/
	public int CsvFileWriter(ArrayList<Animal> list, String filepath) {

		int count = 0;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));) {

			for (int i = 0; i < list.size(); i++) {
				int x;
				bw.write(list.get(i).getName() + ",");
				bw.write(list.get(i).getKind() + ",");
				bw.write(list.get(i).getAge());
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return count += 1;

	}

}
