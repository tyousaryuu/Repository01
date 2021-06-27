package tt.ss.rr;

/**
 * 数组
 * 
 * @author 89749
 *
 * 2018年3月31日
 */
public class Java_00_020_01_4_array {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 3;
		arr[0] = 100;//为索引为0的元素赋值100
		arr[3] = 200; //为索引为3的元素赋值200
		//则arr中索引为0和3的元素值是100与200，其他元素值为0
		System.out.println(arr[2]);//打印结果为0
		System.out.println(arr[3]);//打印结果为200
		int length = arr.length;//数组长度为5
		System.out.println(length);
		
		String[] arr2 = {"我爱Java", "我喜欢Java", "我和Java在一起"};
		arr2[0] = "我热爱Java";//将编号为0的元素值使用“我热爱Java”覆盖掉“我爱Java”
		System.out.println(arr2[0]);//打印结果为“我热爱Java”
		System.out.println(arr2[2]);//打印结果为"我和Java在一起"
		int length2 = arr2.length;//数组长度为3
		System.out.println(length2);
		
		int[] aInt = new int[1];
		short[] aShort = new short[1];
		byte[] aByte = new byte[1];
		long[] along = new long[1];
		float[] aFloat = new float[1];
		double[] aDouble = new double[1];
		boolean[] aBoolean = new boolean[1];
		char[] aChar = new char[1];
		String[] aStr = new String[1];
		System.out.println("int[]:"+aInt[0]);
		System.out.println("short[]:"+aShort[0]);
		System.out.println("byte[]:"+aByte[0]);
		System.out.println("long[]:"+along[0]);
		System.out.println("float[]:"+aFloat[0]);
		System.out.println("double[]:"+aDouble[0]);
		System.out.println("boolean[]:"+aBoolean[0]);
		System.out.println("char[]:"+aChar[0]);// 半角空格
		System.out.println("String[]:"+aStr[0]);
	}
}
