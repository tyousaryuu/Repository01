package tt.ss.rr;

public class ArrayTest2 {

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
		
		/**
		 * java����ĳ����ǲ��ɱ�� ��ò������������ñ�������
		 */
		//��books���������strArr�������ָ��names�����õ�����
		books = names;
		strArr = names;
		System.out.println("-------------");
		System.out.println(books.length);
		System.out.println(strArr.length);
		
		//�ı�books������������õ�����ĵڶ���Ԫ��ֵ
		books[1] = "��ɮ";
		
		System.out.println(books[1]);
		System.out.println(names[1]);
	}

}
