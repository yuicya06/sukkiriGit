package sukkiri.practice.practice_print12.practice02;

public class Main {
	
	//●Mainクラス
	//・メソッド
	//mainメソッド
	//：TravelAgencyクラスのインスタンスを生成する。
	//「Toyota」をコンストラクタに渡し、Carクラスのインスタンスを生成する。
	//「Mountain Bike」をコンストラクタに渡し、Bicycleクラスのインスタンスを生成する。
	//各インスタンスを引数に渡し、planTripメソッドを呼び出す。


	public static void main(String[] args) {
		
		TravelAgency ta = new TravelAgency();
		Vehicle[] vehicle= new Vehicle[2];
		
		vehicle[0] = new Car("Toyota");
		vehicle[1] = new Bicycle("Mountain Bike");
		//ta[0]= new ("Toyota");
//		ta[1]= new Bicycle("Mountain Bike");
		
		for(Vehicle vc: vehicle) {
			
			ta.planTrip(vc);
			
			System.out.println("------------------");
		
		}
		
		

	}

}
