package 线程method;

class DaemonThread extends Thread{
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(super.getName() + "-" + super.isDaemon());
		}
	}
}

//后台线程，又叫守护线程
public class DaemonDemo {
	public static void main(String[] args) {
		Thread.currentThread().getName();//主线程
		System.out.println(Thread.currentThread().isDaemon());
		for (int i = 0; i < 50; i++) {
			System.out.println("main:" + i);
			if(i ==10) {
				DaemonThread d = new DaemonThread();
				d.setDaemon(true);
				d.start();
			}
			//主线程结束，后台线程也结束
		}
	}
}
