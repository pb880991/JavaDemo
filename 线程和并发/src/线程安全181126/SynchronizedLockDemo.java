package 线程安全181126;

class Apple1 implements java.lang.Runnable {
	private int num = 500;

	public void run() {

		for (int i = 0; i < 500; i++) {
			synchronized (this) { //this表示Apple1的对象，属于共享资源，是同步监听对象，不能是num
				if (0 < num) {
					// 模拟网络延迟
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // 吃苹果出了问题
					/*
					 * 解决：打印和--不应分开，必须同步完成。即，A线程进入操作时，B和C不能进入干扰 
					 * 方式1，同步代码块 synchronized(同步锁){......}
					 * 一个时间只有一个线程拥有同步锁
					 */
					System.out.println(Thread.currentThread().getName() + "吃了第" + num + "个苹果");
					num--;
				}
			}
		}
	}
}
//同步代码块
public class SynchronizedLockDemo {
	public static void main(String[] args) {
		Apple1 runnableImpl2 = new Apple1();
		new Thread(runnableImpl2, "小A").start();
		new Thread(runnableImpl2, "小B").start();
		new Thread(runnableImpl2, "小C").start();
	}
}
