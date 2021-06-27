package tt.ss.rr;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * PrintWriterTest
 * 
 * @author Tyousaryuu
 *
 * 2021年6月25日
 */
public class PrintWriterTest {
	public static void main(String[] args) throws FileNotFoundException {
		String dir = System.getProperty("user.dir"); //java虚拟机启动路径（命令解释器的当前路径）
		PrintWriter out = new PrintWriter(dir+"\\src\\tt\\ss\\rr\\out_myfile");
		out.write("out1");
		out.flush();
		out.println();
		out.close();
	}
}
