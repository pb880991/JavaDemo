package ThreadDemo;

class RunDemoThread extends java.lang.Thread{
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("听音乐" +i);
		}
	}
}
//多线程方式1，继承Thread类
public class RunDemo{
	public static void main(String[] args) {
		for (int i = 0; i < 500; i++) {
			System.out.println("打游戏" +i);
			if(i == 10) {
				RunDemoThread runDemoThread = new RunDemoThread();
				runDemoThread.start();
			}
		}
	}
}
