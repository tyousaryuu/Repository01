package tt.ss.rr;

/**
 * 方法
 * @author 89749
 *
 * 2018年3月31日
 */
public class Java_00_020_01_4_method {

	public static void main(String[] args) {

		int result = getSum(100,200); //result此时的值为300
		System.out.println(result); //将结果打印到控制台
		
		printWords(); //控制台直接打印我爱Java

	}
	
	/**
	 * 求两数和(有参数，有返回值)
	 * 
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int getSum(int a,int b) {
		return a+b;
	}
	
	/**
	 * 打印“我爱Java!”(无参数，无返回值)
	 */
	public static void printWords() {
		System.out.println("我爱Java!");
	}

	/**
	 * 方法重载
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a,int b) {return a+b;} //两个数加法
	public int add(int a,int b,int c) {return a+b+c;} //三个数加法
	public int add(int a,int b,int c,int d) {return a+b+c+d;} //四个数加法

}
