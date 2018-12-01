package 线程通信Lock;

public class Consumer implements Runnable {
	private ShareResource resource = null;

	public Consumer(ShareResource resource) {
		this.resource = resource;
	}

	public void run() {
		for (int i = 0; i < 200; i++) {
			resource.popup();
		}
	}
}
