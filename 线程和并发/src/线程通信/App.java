package 线程通信;
//线程通信wait和notify方法：等待和唤醒
//wait()执行该方法的线程对象释放同步锁，JVM把该线程存放到等待池中，等待其他线程唤醒该线程
//notify()执行该方法的线程唤醒在等待池中等待的任意一个线程，把线程转到锁池中等待
//notifyAll()执行该方法的线程唤醒在等待池中等待的所有线程，把线程转到锁池中等待
//只能被同步监听锁对象调用,父类是Object
//多个线程只有使用相同的一个对象的时候，之间才有互斥效果，把这个用来做互斥的对象成为同步监听对象/同步锁
//同步锁对象可以选择任意类型的对象，只需要保证多个线程使用相同的同步锁
//只有同步监听对象才能调用wait()和notify方法，所以其父对象是Object而不是Thread
public class App {
	public static void main(String[] args) {
		//同步锁池：当生产者在生产数据的时候（先拥有同步锁），其他线程就在锁池中等待获取锁
		//同步锁必须选择多个线程共同的资源对象
		//当线程执行完同步代码块的时候，就会释放同步锁，其他线程开始抢锁的使用权
		ShareResource resource = new ShareResource();
		//启动生产线程
		new Thread(new Producer(resource)).start();
		//启动消费线程
		new Thread(new Consumer(resource)).start();
	}
}
