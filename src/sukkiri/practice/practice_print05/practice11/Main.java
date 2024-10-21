package sukkiri.practice.practice_print05.practice11;

//考査出題
public class Main {

	public static int function(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + function(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(function(10));

	}

}
/*

f(10)
//elseの中にはいる
= 10 + f(10-1)

= 10 + f(9)

f(9)= 9 + f(9-1)

f(8)= 8 + f(8-1)

f(7)= 7 + f(6)

f(6)= 6 + f(5) 

f(5)= 5 + f(4)

f(4)= 4 + f(3)

f(3)= 3 + f(2)

f(2)= 2 + f(1)		ここでreturn 1;

= 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1

=11 * 5

=55


 */
