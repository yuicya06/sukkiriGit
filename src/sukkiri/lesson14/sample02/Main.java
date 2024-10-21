package sukkiri.lesson14.sample02;

public class Main {

	public static void main(String[] args) {
		Object o1= new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";
		
		System.out.println(o1);
		System.out.println(o2);
		//暗黙的にString型
		System.out.println(o3);
		
		/*14-3*/
		show(o1);
		Empty e1 = new Empty();
		show(e1);
		
		

	}
	//なんでも受け取れるは、危険性が高いので、おすすめしない
	/*14-3*/
	public static void show(Object obj) {
		System.out.println(obj.toString());
	}

}
