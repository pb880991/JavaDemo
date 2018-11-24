package ThreadDemo;

class MusicRunnableImpl implements java.lang.Runnable{
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("听音乐" +i);
		}
	}
}

//多线程方式2，实现Runnable接口
public class RunnableDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 500; i++) {
			System.out.println("打游戏" +i);
			if(i == 10) {
				Runnable target = new MusicRunnableImpl();
				Thread thread = new Thread(target);
				thread.start();
			}
		}
	}
}
