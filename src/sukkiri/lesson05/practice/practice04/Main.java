package sukkiri.lesson05.practice.practice04;

public class Main {
	

	
	/**
	 * 
	 * calcTriangleArea
	 * 戻り値：double
	 * 引数リスト double bottom、double height
	 * 
	 * ※書き方：戻り値がある時は、先にretun 1; のように書いておくと良い
	 */
	
	//引数として受け取った底辺の長さと高さから、三角形の面積を求めて戻す
	/**
	 * 
	 * @param bottom
	 * @param height
	 * @return
	 */
	public static double calcTriangleArea(double bottom, double height) {

		double areaTriangle = bottom * height / 2.0;
		return areaTriangle;
	}

	
	/**
	 * 
	 * calcCircleArea
	 * 戻り値：double
	 * 引数リスト double radius
	 */
	//引数として受け取った半径から、円の面積を求めて戻す
	public static double calcCircleArea(double radius) {

		double areaCircle = radius * radius * 3.14;
		return areaCircle;


	}

	public static void main(String[] args) {

		//三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は25.0平方cm
		double triangle = calcTriangleArea(10.0, 5.0);
		System.out.println(triangle);

		//円の半径が5.0cmの場合、面積は78.5cm
		double circle = calcCircleArea(5.0);
		System.out.println(circle);
	}

}
