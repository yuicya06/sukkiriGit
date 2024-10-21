package sukkiri.practice.practice_print14.practice01;

//●Vectorクラス
//・フィールド　※アクセス修飾子はすべてprivate
//型	変数名・定数名
//double	x
//double	y
//・コンストラクタ
//　　　引数を2つ受け取り、フィールドにセット
//・メソッド
//　　toStringメソッド
//　　　：オーバーライドして、出力結果例のような文字列を返す。


public class Vector {
	
	private double x;
	private double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		
		
		return "Vector(" + x + "," + y +")" ;
	}
	

}
