package 吃苹果比赛;
//继承的方式
/*两者区别
 * 1.继承的方式：Java中类是单继承的，只能继承Thread一个类
 * 			   操作上简单
 * 			   多线程不能共享资源(要加static)
 * 2.实现的方式：Java中类可以实现多个接口，该类还可以继承其他类，设计上更优秀
 * 			   操作上更复杂
 * 			   多线程可以共享资源
 * 尽量用实现方式，更合理
 * */
class Person extends Thread {
	static private int num = 50; //添加static修饰，不然没人都吃50个苹果
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			if (0 < num) {
				System.out.println(getName() + "吃了第" + num-- + "个苹果");
			}
		}
	}
}

public class ExtendsDemo {
	public static void main(String[] args) {

		new Person("小A").start();
		new Person("小B").start();
		new Person("小C").start();
	}
}
