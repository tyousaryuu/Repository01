package tt.ss.rr;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * PrintWriterTest
 * 
 * @author Tyousaryuu
 *
 * 2021��6��25��
 */
public class PrintWriterTest {
	public static void main(String[] args) throws FileNotFoundException {
		String dir = System.getProperty("user.dir"); //java���������·��������������ĵ�ǰ·����
		PrintWriter out = new PrintWriter(dir+"\\src\\tt\\ss\\rr\\out_myfile");
		out.write("out1");
		out.flush();
		out.println();
		out.close();
	}
}
