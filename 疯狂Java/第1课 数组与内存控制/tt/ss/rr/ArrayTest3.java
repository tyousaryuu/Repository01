package tt.ss.rr;

/**
 * Java数组变量是引用类型的变量，并不是数组对象本身，只要让数组变量指向有效的数组对象，程序中即可使用该数组变量
 * 数组变量：只是一个引用变量，通常放在栈内存中（也可被放在堆内存中）。
 * 数组对象：保存在堆内存中的连续内存空间（应该即为真正的数组）。
 * @author 89749
 *
 * 2018年4月7日
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		
		// 定义并初始化nums数组
		int[] nums = new int[]{3,5,20,12};
		
		// 定义一个数组变量
		int[] prices;
		
		// 让prices数组变量指向nums数组变量指向的数组
		prices = nums;
		
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		//将prices数组第3个值赋值为32
		prices[2] = 32;
		
		System.out.println(nums[2]);
	}
}
