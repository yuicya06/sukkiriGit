package paiza.sample.c155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n ; i++) {
			
			String w = sc.nextLine();
			if(w.contains(str)) {
				
			System.out.println("Yes");
				
			}else {
				System.out.println("No");
			}
			
			
		}
		

	}

}
