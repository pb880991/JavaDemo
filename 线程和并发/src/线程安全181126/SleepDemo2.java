package 线程安全181126;

//实现接口的方式
class RunnableImpl2 implements java.lang.Runnable{
	private int num = 50;

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (0 < num) {
				//模拟网络延迟
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}//吃苹果出了问题
				/*解决：打印和--不应分开，必须同步完成
				 * 即，A线程进入操作时，B和C不能进入干扰
				 * 方式1，同步代码块
				 * 		 synchronized(同步锁){......} ，一个时间只有一个线程拥有同步锁
				 * 方式2：同步方法
				 * 		 使用synchronized修饰的方法，此时同步锁是this（非static方法）,或方法所在类的字节码对象(static方法)
				 * 方式3：锁机制（Lock)
				 * */
				System.out.println(Thread.currentThread().getName() + "吃了第" + num-- + "个苹果");
				//Thread.currentThread().getName()获取当前线程对象的名称
			}
		}
	}
}

public class SleepDemo2 {
	public static void main(String[] args) {
		RunnableImpl2 runnableImpl2 = new RunnableImpl2();//三个线程共用一个runnableImpl2对象，因此分吃50个苹果
		new Thread(runnableImpl2,"小A").start();
		new Thread(runnableImpl2,"小B").start();
		new Thread(runnableImpl2,"小C").start();
	}
}
