package sukkiri.practice.practice_print11.practice04;

//●Circle(Shapeインタフェースを実装)
//・フィールド　※アクセス修飾子はすべて付けない
//型	変数名・定数名
//double	radius
//・コンストラクタ
//　引数を1つ受け取り、フィールドにセット
//・メソッド
//calculateAreaメソッド
//　：インタフェースからオーバーライドして、実装する。処理内容は円の面積を返す。

public class Circle implements Shape {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	//クラスが持っているメソッド(static double) PI
	//インスタンスメソッドと同様
	@Override
	public double calculateArea() {
		
		double circleArea =  this.radius * this.radius * Math.PI;
		
		return circleArea;
	}




}
