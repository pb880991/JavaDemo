package 线程通信;

public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;

	// 存储数据 ，加synchronized可以解决性别紊乱情况
	synchronized public void push(String name, String gender) {
		try {
			while (!isEmpty) {
				this.wait();//使用同步锁对象调用，表示当前线程释放同步锁，进入等待池，只能被其他线程唤醒
			}
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			isEmpty = false;
			this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 消费
	synchronized public void popup() {
		try {
			while (isEmpty) {
				this.wait();
			}
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			isEmpty = true;
			this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
