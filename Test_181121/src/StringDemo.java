
/**
 * @author czh
 *
 */
public class StringDemo {
	/*
	 * StringBuilder和StringBuffer可变字符串
	 */

	public static void main(String[] args) {
		System.out.println(121242);
		String str = "老婆大人";
		System.out.println("我爱" + str);
		System.out.println(hasLength(str));

		CharSequenceDemo.testString();
		CharSequenceDemo.testStringBuffer();
		CharSequenceDemo.testStringBuilder();

		StringBuilderDemo builderDemo = new StringBuilderDemo();
		builderDemo.sb1.append("A").append("B");// 链式编程
		builderDemo.OOXX().OOXX();
		builderDemo.sb1.deleteCharAt(builderDemo.sb1.length() - 1);// 删除
		System.out.println(builderDemo.sb1);
	}

	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}
}
