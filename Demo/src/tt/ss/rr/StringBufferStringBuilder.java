package tt.ss.rr;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		new StringBuffer(); // 线程安全
		new StringBuilder(); // 线程不安全
	}

}
