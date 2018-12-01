package 线程method;

public class SleepDemo {
	public static void main(String[] args) throws Exception {
		int m = 10;
		for (int i = 0; i < 10; i++) {
			System.out.println("还剩" + (m - i) + "秒");
			Thread.sleep(1000);
		}
		System.out.println("爆炸");
	}
}
