package tt.ss.rr;

/**
 * ����
 * 
 * @author 89749
 *
 * 2018��3��31��
 */
public class Java_00_020_01_4_array {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 3;
		arr[0] = 100;//Ϊ����Ϊ0��Ԫ�ظ�ֵ100
		arr[3] = 200; //Ϊ����Ϊ3��Ԫ�ظ�ֵ200
		//��arr������Ϊ0��3��Ԫ��ֵ��100��200������Ԫ��ֵΪ0
		System.out.println(arr[2]);//��ӡ���Ϊ0
		System.out.println(arr[3]);//��ӡ���Ϊ200
		int length = arr.length;//���鳤��Ϊ5
		System.out.println(length);
		
		String[] arr2 = {"�Ұ�Java", "��ϲ��Java", "�Һ�Java��һ��"};
		arr2[0] = "���Ȱ�Java";//�����Ϊ0��Ԫ��ֵʹ�á����Ȱ�Java�����ǵ����Ұ�Java��
		System.out.println(arr2[0]);//��ӡ���Ϊ�����Ȱ�Java��
		System.out.println(arr2[2]);//��ӡ���Ϊ"�Һ�Java��һ��"
		int length2 = arr2.length;//���鳤��Ϊ3
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
		System.out.println("char[]:"+aChar[0]);// ��ǿո�
		System.out.println("String[]:"+aStr[0]);
	}
}
