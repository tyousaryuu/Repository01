package tt.ss.rr;

import java.util.Scanner;
/**
 * EnumTest
 * 使用场景不明
 * @author Tyousaryuu
 *
 * 2021年6月26日
 */
public class EnumTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size:SMALL,MEDIUM,LARGE,EXTRA_LARGE");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("Size=" + size);
		System.out.println("abbreviation:" + size.getAbbreviation());
		in.close();
	}

}

enum Size {
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("EL");
	private String abbreviation;
	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
}