package tt.ss.rr;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] simplePrimes = { 2, 3, 5, 7, 11, 13 };
		System.out.println(simplePrimes);
		System.out.println("Arrays.toString()" + ":" + Arrays.toString(simplePrimes));
		int[] copiedSimplePrimes = Arrays.copyOf(simplePrimes, 3);
		for (int i : copiedSimplePrimes) {
			System.out.print(i + " ");
		}
	}
}
