package sukkiri.object_interface_class.sample01;

//抽象メソッドしかもたないもの
//インスタンス化不可
//したがって、実装が必要

public interface Animal { //①インタフェース
	//フィールド
	//②インタフェースのフィールド
	//いちおう持てるが、あんまり使わない
	static final String livingBeing = "動物"; 
	
	//抽象メソッド（public abstract は省略可）
	//public abstract void run(); 
	void run(); //③抽象メソッド
	
	//デフォルトメソッド
	default void showLivingBeing() { //④デフォルトメソッド
	System.out.println(livingBeing);
	 }
	}
