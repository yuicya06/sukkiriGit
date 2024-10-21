package sukkiri.lesson13.sample02;

public class Main {

	public static void main(String[] args) {
			
		//インスタンス生成
		Hero hero = new Hero();
		
		Hero h = new Hero();
		String HeroName = h.name;
		
		hero.name = "minato";
		
		
		
		
		
		//heroインスタンスのフィールドnameに値をセット
		hero.setName("勇者");
				
		//heroインスタンスのフィールドnameを取得し、表示
		System.out.println( hero.getName());
				
		/*以下はアクセス修飾子がprivateなのでエラーになる*/
//		hero.name = "勇者";
//		System.out.println( hero.name );

	}

}
