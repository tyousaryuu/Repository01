package tt.ss.rr;

/**
 * 引用类型的数组元素依然是引用。
 * Reference引用参照
 * @author 89749
 *
 * 2018年4月7日
 */
public class ReferenceArrayTest {

	public static void main(String[] args) {
		// 定义数组变量
		Person[] students;
		// 执行动态初始化
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
		
		// lee和students[1]指向的是同一个Person实例
		lee.info();
		students[1].info();
	}

}
