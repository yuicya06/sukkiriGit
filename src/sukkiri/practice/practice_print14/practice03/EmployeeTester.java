package sukkiri.practice.practice_print14.practice03;

public class EmployeeTester {

	public static void main(String[] args) {

		//(5) EmployeeTesterで、以下のデータを持つインスタンスを作成し、配列empsに保存。
		//配列：emps[0]
		//id：101
		//name：ドラえもん
		//dept：営業部
		//
		//配列：emps[1]
		//id：201
		//name：のび太
		//dept：総務部
		//
		//配列：emps[2]
		//id：202
		//name：スネ夫
		//dept：総務部

		Employee[] emps = new Employee[3];

		emps[0] = new Employee(101, "ドラえもん", "営業部");
		emps[1] = new Employee(201, "のび太", "総務部");
		emps[2] = new Employee(202, "スネ夫", "総務部");

		//		emps[0].setId(101);
		//		emps[0].setName("ドラえもん");
		//		emps[0].setDept("営業部");
		//		emps[1].setId(201);
		//		emps[1].setName("のび太");
		//		emps[1].setDept("総務部");
		//		emps[2].setId(202);
		//		emps[2].setName("スネ夫");
		//		emps[2].setDept("総務部");

		for (int i = 0; i < emps.length; i++) {

			System.out.println(emps[i].toString());

		}

		//		(7)以下のデータが存在するかequalsを使用して確認。
		//		データが存在する場合は「データが存在します。」を表示、
		//		データが存在しない場合は「データが存在しません。」を表示する。
		//
		//		確認するデータはEmployeeのインスタンスを作成して比較する
		//
		//		確認データ
		//		id：201
		//		name：のび太
		//		dept：総務部

				Employee emp = new Employee(202, "スネ夫", "総務部");
				
				for(int i =0; i < emps.length; i++) {
					if(emp.equals(emps[i])) {
						
						System.out.println("データが存在します");
						break;
						
					}
					
					if(i == emps.length - 1 ) {
						
						System.out.println("データが存在しません");
		
					}
					
					
				}
				

	}

}

