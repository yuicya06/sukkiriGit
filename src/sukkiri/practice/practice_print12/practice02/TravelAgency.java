package sukkiri.practice.practice_print12.practice02;

public class TravelAgency {
	
	/*method*/
	//Vehicle型あるいは、その派生の型を受け付ける
	public void planTrip(Vehicle vehicle) {
		System.out.println("Planning a trip using " + vehicle.getName());
		vehicle.start();
		vehicle.stop();
		
	}

}
