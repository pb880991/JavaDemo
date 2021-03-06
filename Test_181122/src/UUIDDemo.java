import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class UUIDDemo {
	

	public static void main(String[] args) {
		//UUID绝对随机，没有子类，16进制，一般用来表示随机的唯一的字符串
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		
		//验证码
		String str = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
		str += str.toLowerCase();
		str += "0123456789";
		System.out.println(str);
		ThreadLocalRandom r4 = ThreadLocalRandom.current();
		StringBuilder sb = new StringBuilder(5);
		sb.append(str.charAt(r4.nextInt(str.length())));
		sb.append(str.charAt(r4.nextInt(str.length())));
		sb.append(str.charAt(r4.nextInt(str.length())));
		sb.append(str.charAt(r4.nextInt(str.length())));
		sb.append(str.charAt(r4.nextInt(str.length())));
		System.out.println(sb);
	}
}
