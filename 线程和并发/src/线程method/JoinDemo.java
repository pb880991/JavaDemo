package 线程method;

class Join extends Thread{
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Join:" + i);
		}
	}
}

//联合线程
public class JoinDemo {
	public static void main(String[] args) throws Exception {
		Join j = new Join();
 		for (int i = 0; i < 50; i++) {
			System.out.println("main:" + i);
			if(i ==10) {
				j.start();
			}
			if(i ==20) {
				j.join();//强制运行该线程
			}
		}
	}
}
