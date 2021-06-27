package tt.ss.rr;

import java.util.Random;
import java.util.Scanner;

/**
 * ���������
 * @author 89749
 *
 * 2018��3��31��
 */
public class Java_00_020_01_4_random {

	public static void main(String[] args) {
		System.out.println("--------���������--------");

		// ����һ���洢���ͬѧ���ֵ����������飩 
		String[] students = new String[3];

		/*
		 * 1.�洢ȫ��ͬѧ����
		 */
		addStudentName(students);
		
		/*
		 * 2.��ӡȫ��ͬѧÿһ���˵�����
		 */
		printStudentName(students);
	
		/*
		 * 3.��ȡ�����������ѧ������������ӡ
		 */
		String randomName = randomStudentName(students);
		System.out.println("���㵽����ͬѧ�� :" + randomName);

	}

	/**
	 * 1.�洢ȫ��ͬѧ����
	 * .����һ���洢���ͬѧ���ֵ����������飩 
	 * .��������ÿ��ͬѧ�����֣��洢�������У����飩
	 */
	public static void addStudentName(String[] students) {
		// 1.2����������ͬѧ���ִ洢��������
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("�洢��"+i+"��ѧ�����ƣ�");
			// ��ɨ�赽��ѧ����������������
			students[i] = sc.next();
		}
		sc.close();
	}

	/**
	 * 2��ӡȫ��ͬѧÿһ���˵�����
	 */
	public static void printStudentName(String[] students) {
		//�������������飩���õ�ÿ��ͬѧ����
		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			//��ӡͬѧ����
			System.out.println("��"+i+"��ѧ�����ƣ�" + name);
		}
	}

	/**
	 * 3.�ڰ༶��������Χ�ڣ��������һ�������
	 */
	public static String randomStudentName(String[] students) {

		//�������鳤�ȣ���ȡ�������
		int index = new Random().nextInt(students.length);
		//ͨ����������������л�ȡ����
		String name = students[index];
		//��������㵽������
		return name;
	}

}
