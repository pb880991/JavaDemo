package 线程通信Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	//如果用Lock锁机制，则需要用到Condition,方法为await()和signal()，signalAll()
	private Condition condition = lock.newCondition();
	// 存储数据 ，加synchronized可以解决性别紊乱情况
	public void push(String name, String gender) {
		lock.lock();
		try {
			while(!isEmpty) {
				condition.await();
			}
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			isEmpty = false;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	// 消费
	public void popup() {
		lock.lock();
		try {
			if(isEmpty) {
				condition.await();
			}
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			isEmpty = true;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
