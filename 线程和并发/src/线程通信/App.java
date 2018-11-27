package 线程通信;

public class App {
	public static void main(String[] args) {
		ShareResource resource = new ShareResource();
		//启动生产线程
		new Thread(new Producer(resource)).start();
		//启动消费线程
		new Thread(new Consumer(resource)).start();
	}
}
