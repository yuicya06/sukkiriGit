package sukkiri.practice.practice_print17_re.prctice05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id>");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("name>");
		String name = sc.nextLine();

		User u = new User(id, name);
		System.out.println(u.toString());

	}

}
