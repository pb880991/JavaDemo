package 线程method;

//线程的优先级，可以先启动后设置，最高 10，最低1，默认5，高并不是先运行
public class PriorityDemo {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
	}
}
