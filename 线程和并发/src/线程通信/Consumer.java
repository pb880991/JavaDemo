package 线程通信;

public class Consumer implements Runnable {
	private ShareResource resource = null;

	public Consumer(ShareResource resource) {
		this.resource = resource;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			resource.popup();
		}
	}
}
