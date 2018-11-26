package 线程安全181126;

class Apple2 implements java.lang.Runnable {
	private int num = 500;

	// synchronized不能修饰run()方法
	public void run() {
		for (int i = 0; i < 500; i++) {
			eat();
		}
	}

	synchronized private void eat() {
		if (0 < num) {
			// 模拟网络延迟
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 吃苹果出了问题
			System.out.println(Thread.currentThread().getName() + "吃了第" + num + "个苹果");
			num--;
		}
	}
}

//同步方法
public class FunctionLockDemo {
	public static void main(String[] args) {
		Apple2 runnableImpl2 = new Apple2();
		new Thread(runnableImpl2, "小A").start();
		new Thread(runnableImpl2, "小B").start();
		new Thread(runnableImpl2, "小C").start();
	}
}
