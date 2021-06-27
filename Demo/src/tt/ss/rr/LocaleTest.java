package tt.ss.rr;

import java.util.Arrays;
import java.util.Locale;
/**
 * LocaleTest
 * 
 * @author Tyousaryuu
 *
 * 2021Äê6ÔÂ26ÈÕ
 */
public class LocaleTest {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Locale.getAvailableLocales()));
		System.out.println(Locale.getDefault());
		System.out.println(Arrays.toString(Locale.getISOCountries()));
		System.out.println(Arrays.toString(Locale.getISOLanguages()));
	}
}
