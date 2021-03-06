package regex_正则表达式;

public class RegexDemo {
	public static void main(String[] args) {
		//正则表达式主要用来匹配判断，分割操作，替换操作
		String input = "124352";
		boolean ok = isNumber(input);
		System.out.println(ok);
		
		System.out.println(input.matches("\\d"));
		System.out.println(input.matches("\\d*"));
		System.out.println(input.matches("\\d{5,8}"));
		System.out.println(input.matches("\\d{8}"));
		//底层两个类Pattern和Mather.
		
	}
	
	private static boolean isNumber(String str) {
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if( c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
}
