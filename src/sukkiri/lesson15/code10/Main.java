package sukkiri.lesson15.code10;

public class Main {

	public static void main(String[] args) {

		//System...() : PC内の時間をミリ秒で表したもの
		long start = System.currentTimeMillis();

		System.out.println(start);
		//1724821021526
		//1724821042156（増える＜この差だけ時が進んだ＞）

		//ここで何らかの時間がかかる処理

		String s = null;
		for (int i = 0; i < 10000; i++) {
			s = s + "java";

		}

		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
	}

}
