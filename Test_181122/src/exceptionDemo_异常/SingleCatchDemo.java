package exceptionDemo_异常;

public class SingleCatchDemo {
	public static void main(String[] args) {
		System.out.println("开始---------------------");
		try {
			int tt = 10 / 0;
			System.out.println("结果=" + tt);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			// 种类：记录日志，打印异常，继续跑出异常
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

		System.out.println("结束---------------------");
	}
}
