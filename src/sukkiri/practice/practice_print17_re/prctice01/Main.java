package sukkiri.practice.practice_print17_re.prctice01;

public class Main {
	
	public static void main(String[] args) {
		try {
			int x = 5;
			int y = 0;
			int result = x / y;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0で割れません");
			
		}
	
	
	}


}
