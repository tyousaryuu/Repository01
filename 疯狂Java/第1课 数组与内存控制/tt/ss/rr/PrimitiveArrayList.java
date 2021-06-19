package tt.ss.rr;

/**
 * 基本数据类型的初始化：程序直接先为数组分配内存空间，再将数组元素的值存入对应的内存里
 * primitive：原始的基本的
 * @author 89749
 *
 * 2018年4月7日
 */
public class PrimitiveArrayList {

	public static void main(String[] args) {
		//定义一个int[]类型的数组变量
		int[] iArr;
		//静态初始化数组，数组长度为4
		iArr = new int[]{2,5,-12,20};
		
		System.out.println(iArr);
	}

}
