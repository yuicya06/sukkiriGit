package sukkiri.practice.practice_print17_re.prctice02;

public class Main {

	public static void main(String[] args) {

		try {
			String str = null;
			int length = str.length();
			System.out.println(length);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("nullあり");
		}
	}

}
