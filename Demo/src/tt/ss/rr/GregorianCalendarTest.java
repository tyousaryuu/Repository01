package tt.ss.rr;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * GregorianCalendar
 * 
 * @author Tyousaryuu
 *
 * 2021��6��24��
 */
public class GregorianCalendarTest {

	public static void main(String[] args) {
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int year = d.get(Calendar.YEAR);
		
//		d.set(Calendar.DAY_OF_MONTH, 1);
		
		int weekday = d.get(Calendar.WEEK_OF_MONTH);
		
		int firstOfWeek = d.getFirstDayOfWeek();// �@ʾһ���еĵ�һ�������� �Ї���������һ ����������
		System.out.println(d);
		System.out.println(today);
		System.out.println(year);
		System.out.println(weekday);
		System.out.println(firstOfWeek);
		
//		double pi = Math.PI;
//		double pow = Math.pow(2, 3);
//		System.out.println(pow);
		
	}

}
