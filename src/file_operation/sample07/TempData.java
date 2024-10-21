package file_operation.sample07;

import java.text.SimpleDateFormat;
import java.util.Date;

//日付、平均・最高・最低気温の値を持つクラス
public class TempData {
	
	Date date;
	double aveTemp; //平均気温
	double maxTemp; //最高気温
	double minTemp; //最低気温
	
	public TempData(Date date, double aveTemp, double maxTemp, double minTemp) {
		setDate(date);
		setAveTemp(aveTemp);
		setMaxTemp(maxTemp);
		setMinTemp(minTemp);
	}
	
	
	public String strDate(Date date) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
		return fmt.format(date);
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAveTemp() {
		return aveTemp;
	}
	public void setAveTemp(double aveTemp) {
		this.aveTemp = aveTemp;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	
	
	
	

}

