import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//随机数
public class RandomDemo {
	
	
	
	public static void main(String[] args) {
		//Random伪随机数，种子相同结果就相同
		Random r1 = new Random(10);
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt(100));
		System.out.println("----------------------");
		Random r2 = new Random(11);//种子不同，生成的随机数也不同
		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextDouble());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt(100));
		//生成34到179之间的随机数
		int r3 = new Random().nextInt(145) + 34;
		System.out.println(r3);
		
		System.out.println("----------------------");
		//ThreadLocalRandom是Random的子类，可以减少多线程资源竞争
		ThreadLocalRandom r4 = ThreadLocalRandom.current();
		System.out.println(r4.nextBoolean());
		System.out.println(r4.nextDouble());
		System.out.println(r4.nextInt());
		System.out.println(r4.nextInt(34,179));
	}
}
