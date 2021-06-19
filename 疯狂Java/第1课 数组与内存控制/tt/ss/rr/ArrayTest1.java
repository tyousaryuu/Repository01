package tt.ss.rr;

/**
 * 数组创建的三种方式
 * 
 * @author 89749
 *
 */
public class ArrayTest1 {

	public static void main(String[] args) {
		
		//采用静态初始化方式初始第一个数组
		String[] books = new String[]
		{"疯狂Java讲义","轻量级Java EE企业级应用","疯狂Ajax讲义","疯狂XML讲义"};

		//采用静态初始化简化方式初始第二个数组
		String[] names = {"孙悟空","猪八戒","白骨精"};
		
		//采用动态初始化方式初始第三个数组
		String[] strArr = new String[3];
		
		//访问三个数组的长度
		System.out.println(books.length);
		System.out.println(names.length);
		System.out.println(strArr.length);
		
		System.out.println(books);
		System.out.println(books.toString());
	}

}
