package tt.ss.rr;

/**
 * �������͵�����Ԫ����Ȼ�����á�
 * Reference���ò���
 * @author 89749
 *
 * 2018��4��7��
 */
public class ReferenceArrayTest {

	public static void main(String[] args) {
		// �����������
		Person[] students;
		// ִ�ж�̬��ʼ��
		students = new Person[2];
		System.out.println(students.length);
		
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		
		Person lee = new Person();
		lee.age = 16;
		lee.height = 161;
		
		students[0] = zhang;
		students[1] = lee;
		
		// lee��students[1]ָ�����ͬһ��Personʵ��
		lee.info();
		students[1].info();
	}

}
