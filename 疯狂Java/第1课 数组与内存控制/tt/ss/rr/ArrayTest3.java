package tt.ss.rr;

/**
 * Java����������������͵ı��������������������ֻҪ���������ָ����Ч��������󣬳����м���ʹ�ø��������
 * ���������ֻ��һ�����ñ�����ͨ������ջ�ڴ��У�Ҳ�ɱ����ڶ��ڴ��У���
 * ������󣺱����ڶ��ڴ��е������ڴ�ռ䣨Ӧ�ü�Ϊ���������飩��
 * @author 89749
 *
 * 2018��4��7��
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		
		// ���岢��ʼ��nums����
		int[] nums = new int[]{3,5,20,12};
		
		// ����һ���������
		int[] prices;
		
		// ��prices�������ָ��nums�������ָ�������
		prices = nums;
		
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		//��prices�����3��ֵ��ֵΪ32
		prices[2] = 32;
		
		System.out.println(nums[2]);
	}
}
