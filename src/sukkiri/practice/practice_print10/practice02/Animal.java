package sukkiri.practice.practice_print10.practice02;

//・フィールド　※アクセス修飾子はprivate
//型	変数名・定数名
//String	species
//
//・コンストラクタ
//　　　：引数を1つ受け取り、フィールドにセットする。
//
//・メソッド
//　　makeSoundメソッド
//　　　：「The animal makes a sound.」と表示する。
//　　フィールドのsetter, getterを用意


public class Animal {
	
	private String species;
	
	public Animal(String species) {
	
		this.species = species;
	}
	
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
	
	
	public String getSpecies() {
		return this.species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	

}
