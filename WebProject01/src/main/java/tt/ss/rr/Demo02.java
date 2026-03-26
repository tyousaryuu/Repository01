package tt.ss.rr;

import java.util.Locale;
import java.util.ResourceBundle;

public class Demo02 {

	public static void main(String[] args) {
		
		ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("a","b"));
		String string = bundle.getString("test");
		System.out.println(string);
		
		
	}

}
