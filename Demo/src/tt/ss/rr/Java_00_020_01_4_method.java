package tt.ss.rr;

/**
 * ����
 * @author 89749
 *
 * 2018��3��31��
 */
public class Java_00_020_01_4_method {

	public static void main(String[] args) {

		int result = getSum(100,200); //result��ʱ��ֵΪ300
		System.out.println(result); //�������ӡ������̨
		
		printWords(); //����ֱ̨�Ӵ�ӡ�Ұ�Java

	}
	
	/**
	 * ��������(�в������з���ֵ)
	 * 
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int getSum(int a,int b) {
		return a+b;
	}
	
	/**
	 * ��ӡ���Ұ�Java!��(�޲������޷���ֵ)
	 */
	public static void printWords() {
		System.out.println("�Ұ�Java!");
	}

	/**
	 * ��������
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a,int b) {return a+b;} //�������ӷ�
	public int add(int a,int b,int c) {return a+b+c;} //�������ӷ�
	public int add(int a,int b,int c,int d) {return a+b+c+d;} //�ĸ����ӷ�

}
