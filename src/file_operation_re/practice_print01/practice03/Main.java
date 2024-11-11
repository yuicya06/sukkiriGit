package file_operation_re.practice_print01.practice03;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {

		csvFileReader();

	}

	public static void csvFileReader() {

		String filepath = "file\\AnimalData.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filepath));) {
			
			String line;
			
			while((line = br.readLine()) != null) {
				
				System.out.println(line);
				
			}
			
			
			

		} catch (Exception e) {

		}

	}

}
