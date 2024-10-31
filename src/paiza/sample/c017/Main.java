package paiza.sample.c017;

//・1つ目の番号が大きいカードのほうが強い
//・1つ目の番号が同じ場合、2つ目の番号が小さいカードのほうが強い

//5 1
//2
//7 2
//1 4
//
//
//Low
//High

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] parent = new int[2];
		for (int i = 0; i < parent.length; i++) {

			parent[i] = sc.nextInt();

		}

		sc.nextLine();

		int n = sc.nextInt();

		int[][] child = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {

				child[i][j] = sc.nextInt();

				if (parent[0] > child[i][0]) {
					System.out.println("High");
					break;
				} else if (parent[0] < child[i][0]) {
					System.out.println("Low");
					break;

				} else {

					child[i][j + 1] = sc.nextInt();

					if (parent[1] < child[i][j + 1]) {
						System.out.println("High");
						break;
					} else if (parent[1] > child[i][j + 1]) {
						System.out.println("Low");
						break;
					}

				}

			}

			sc.nextLine();

		}

	}

}
