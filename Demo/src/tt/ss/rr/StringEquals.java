package tt.ss.rr;

/**
 * String equals ==
 * @author Tyousaryuu
 *
 * 2021��6��25��
 */
public class StringEquals {
	public static void main(String[] args) {
		String greeting = "Hello";
		System.out.println(greeting == "Hello");
		System.out.println(greeting.substring(0, 3));
		System.out.println(greeting.substring(0, 3).hashCode());
		System.out.println("Hel".hashCode());
		System.out.println(greeting.substring(0, 3) == "Hel");// �Ƚϵ�ַ
		System.out.println(greeting.substring(0, 3).equals("Hel"));// �Ƚ�����
	}
}
