package tt.ss.rr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamTest {
	public static void main(String[] args) throws FileNotFoundException {
		String dir = System.getProperty("user.dir"); //java虚拟机启动路径（命令解释器的当前路径）
		PrintStream ps = new PrintStream(new File(dir+"\\src\\tt\\ss\\rr\\PrintStream_file"));
		ps.printf("Hello,%s. Next Year,you will be %d.", "xiaoming1", 20);
		ps.close();
		
		double x = 100000.0 / 3.0;
		System.out.println(x); // 3333.3333333333335
		System.out.printf("%8.2f", x); // 3333.33
		System.out.printf("%,10.2f", 10000.0 / 3.0); // 3,333.33
		
		String nam = "zhangsan";
		int age = 15;
		System.out.printf("Hello,%s. Next Year,you will be %d.", nam, age);
		
		
		System.out.println(new Date()); // Tue Jul 24 21:52:17 CST 2018
		System.out.printf("%tc",new Date()); // 星期二 七月 24 21:53:17 CST 2018
		
	}

}
