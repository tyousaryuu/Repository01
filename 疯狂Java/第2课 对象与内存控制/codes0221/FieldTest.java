package codes0221;

/**
 * ��Ա��������̬����
 * 
 * @author 89749
 *
 */
public class FieldTest {
	public static void main(String[] args) {
		//����������౾��ֻҪ���ʼ����ɣ�����Ϳ���ʹ�������
		Person.eyeNum = 2;
		System.out.println(Person.eyeNum);
		Person p = new Person();
		p.name = "��˽�";
		p.age = 300;
		System.out.println(Person.eyeNum);
		p.info();
	}
}
