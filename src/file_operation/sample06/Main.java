package file_operation.sample06;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		CsvOperation co = new CsvOperation();
		ArrayList<Animal> list = new ArrayList<>();
		
		
		list = co.CsvFileReader();
		
		for(Animal animal: list) {
			animal.show();
		}
		
		  int count = co.CsvFileWriter(list, "file\\AnimalData2.txt");
		  if(count ==1 ) {
			  System.out.println("書き込みました");
		  }else {
			  System.out.println("書き込みませんでした");
		  }
		  
		  System.out.println("-------------------");
		  
		 list = null;
		 
		 list = co.CsvFileReader("file\\AnimalData2.txt");
		
		 for(Animal animal:list) {
			 animal.show();
		 }
		
	}

}
