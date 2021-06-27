package tt.ss.rr;

import java.math.BigInteger;
/**
 * BigIntegerTest
 * 
 * @author Tyousaryuu
 *
 * 2021Äê6ÔÂ25ÈÕ
 */
public class BigIntegerTest {
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(200);
		BigInteger b = BigInteger.valueOf(10);
		BigInteger c = a.add(b); // 200+10=210
		BigInteger d = a.subtract(b); // 200-10=190
		BigInteger e = a.multiply(b); // 2000
		BigInteger f = a.divide(b); // 20
		System.out.println(c +" " + d + " " + e + " " +f);
	}
}
