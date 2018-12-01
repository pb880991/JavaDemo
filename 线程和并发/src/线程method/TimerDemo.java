package 线程method;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		new Timer(false).schedule(new XX(), 3000, 1000);//默认前台，false相当于无参数
		new Timer().schedule(new XX(), 6000);
	}
}

class XX extends TimerTask{
	public void run() {
		System.out.println("avdszfdfd");
	}
}
