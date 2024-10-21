package file_operation.sample07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

//CSVファイル操作を行うクラス
public class CsvReader {

	final String FILE_PATH;

	public CsvReader() {

		System.out.println(System.getProperty("user.dir"));

		this.FILE_PATH = System.getProperty("user.dir") + "\\file\\TempData.csv";

	}

	public void CsvFileReader(List<TempData> list) throws ParseException {

		SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
		//fmt.parse("yyyy/MM/dd");

		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));) {

			String line;
			while ((line = br.readLine()) != null) {

				if (line.contains("#")) {
					;
				} else {

					String[] number = line.split(",");

					list.add( new TempData(fmt.parse(number[0]), Double.parseDouble(number[1]), Double.parseDouble(number[2]),
							Double.parseDouble(number[3])));

				}

			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
