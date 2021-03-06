
/**
 * @author czh
 *
 */
public class CharSequenceDemo {
//分别用String/StringBuilder/StringBuffer拼接30000次字符串,计算损耗时间
//StringBuilder/StringBuffer都表示可变字符串
//而StringBuffer用了synchronized修饰符，在多线程并发的时候可以保证线程安全
//建议使用StringBuilder
	public static void testString()
	{
		long begin = System.currentTimeMillis();
		String strr = "";
		for (int i = 0; i < 30000; i++) {
			strr += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
	public static void testStringBuilder()
	{
		long begin = System.currentTimeMillis();
		StringBuilder strr = new StringBuilder("");
		for (int i = 0; i < 30000; i++) {
			strr.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
	public static void testStringBuffer() 
	{
		long begin = System.currentTimeMillis();
		StringBuffer strr = new StringBuffer("");
		for (int i = 0; i < 30000; i++) {
			strr.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}
