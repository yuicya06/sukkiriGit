package sukkiri.lesson05.code08;

public class Main {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

	public static void main(String[] args) {
		int answer = add(3, 2);
		
		//System.out.println(add(3, 2));
		System.out.println(answer);
		
		int answer_a = add(10, 20);
		int answer_b = add(30, 40);
		
		//System.out.println(add(add(10, 20), add(30, 40)));
		System.out.println(add(answer_a, answer_b));

	}

}
