package tt.ss.rr;

import java.util.ArrayList;

/**
 * 
 * @author 89749
 *
 * 2018��3��31��
 */
public class Java_00_020_01_5_ArrayList {

	public static void main(String[] args) {
		first();
		Goods goods = new Goods();
		goods.ID = 1;
		goods.name = "�����ֱ�����";
		goods.price = 15.5;
		goods.unit = "��";
	}

	/**
	 * ArrayList�򵥽���
	 */
	private static void first() {
		ArrayList<String> list = new ArrayList<String>();
		String s = "�Ұ�Java";
		String s2 = "��ϲ��Java";
		list.add(s);					//�򼯺����������Ϊ0��Ԫ��
		list.add(s2);					//�򼯺����������Ϊ1��Ԫ��
		list.add("����Java��һ��");			//�򼯺����������Ϊ2��Ԫ��

		String data = list.get(1);		//��ȡ����������Ϊ1��Ԫ��
		System.out.println(data);			//��ӡ�����ոջ�ȡ����ֵ

		for(int i=0 ; i<list.size() ; i++) {	//��������
			System.out.println(list.get(i));
		}
	}

}
