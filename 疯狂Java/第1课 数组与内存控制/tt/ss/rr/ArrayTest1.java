package tt.ss.rr;

/**
 * ���鴴�������ַ�ʽ
 * 
 * @author 89749
 *
 */
public class ArrayTest1 {

	public static void main(String[] args) {
		
		//���þ�̬��ʼ����ʽ��ʼ��һ������
		String[] books = new String[]
		{"���Java����","������Java EE��ҵ��Ӧ��","���Ajax����","���XML����"};

		//���þ�̬��ʼ���򻯷�ʽ��ʼ�ڶ�������
		String[] names = {"�����","��˽�","�׹Ǿ�"};
		
		//���ö�̬��ʼ����ʽ��ʼ����������
		String[] strArr = new String[3];
		
		//������������ĳ���
		System.out.println(books.length);
		System.out.println(names.length);
		System.out.println(strArr.length);
		
		System.out.println(books);
		System.out.println(books.toString());
	}

}
