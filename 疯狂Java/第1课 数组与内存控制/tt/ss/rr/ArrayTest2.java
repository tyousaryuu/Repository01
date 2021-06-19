package tt.ss.rr;

public class ArrayTest2 {

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
		
		/**
		 * java数组的长度是不可变的 变得不是数组是引用变量本身
		 */
		//让books数组变量，strArr数组变量指向names所引用的数组
		books = names;
		strArr = names;
		System.out.println("-------------");
		System.out.println(books.length);
		System.out.println(strArr.length);
		
		//改变books数组变量所引用的数组的第二个元素值
		books[1] = "唐僧";
		
		System.out.println(books[1]);
		System.out.println(names[1]);
	}

}
