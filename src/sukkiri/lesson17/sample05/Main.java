package sukkiri.lesson17.sample05;

/*非常に便利です*/

/*try-with resources文*/
//finally 不要


import java.io.FileWriter;

/*17-10*/
public class Main {

	public static void main(String[] args) {
		
		/*FileWriterクラスは、AutoCloseableの
		 * Closeable、Flushable、Appendable、AutoCloseable
		 * をじっそうしているので、try-with-resourcesが使用可能
		 */

		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}

	}

}
