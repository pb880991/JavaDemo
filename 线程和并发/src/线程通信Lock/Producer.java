package 线程通信Lock;
//生产者
public class Producer implements Runnable{
	private ShareResource resource = null;
	
	public Producer(ShareResource resource) {
		this.resource = resource;
	}
	public void run() {
		for (int i = 0; i < 200; i++) {
			if(i % 2== 0) {
				resource.push("春哥哥", "男");
			}else {
				resource.push("凤姐", "女");
			}
		}
	}
}
