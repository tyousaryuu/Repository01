package tt.ss.rr;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 * ScannerTest
 * 
 * @author Tyousaryuu
 *
 * 2021年6月25日
 */
public class ScannerTest {
	public static void main(String[] args) {
		
	}
	
	public void test0() throws IOException{
		String dir = System.getProperty("user.dir"); //java虚拟机启动路径（命令解释器的当前路径）
		Scanner in = new Scanner(Paths.get(dir+"\\src\\demo20180107\\myfile"));
		if(in.hasNext()){
			System.out.println(in.next());
		}
		in.close();
	}
	
	public void test1() throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("My name is " + name + ".");
		in.close();
	}
}
