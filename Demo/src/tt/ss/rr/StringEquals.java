package tt.ss.rr;

/**
 * String equals ==
 * @author Tyousaryuu
 *
 * 2021年6月25日
 */
public class StringEquals {
	public static void main(String[] args) {
		String greeting = "Hello";
		System.out.println(greeting == "Hello");
		System.out.println(greeting.substring(0, 3));
		System.out.println(greeting.substring(0, 3).hashCode());
		System.out.println("Hel".hashCode());
		System.out.println(greeting.substring(0, 3) == "Hel");// 比较地址
		System.out.println(greeting.substring(0, 3).equals("Hel"));// 比较内容
	}
}
