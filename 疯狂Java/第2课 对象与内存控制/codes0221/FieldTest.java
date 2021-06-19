package codes0221;

/**
 * 成员变量及静态变量
 * 
 * @author 89749
 *
 */
public class FieldTest {
	public static void main(String[] args) {
		//类变量属于类本身，只要类初始化完成，程序就可以使用类变量
		Person.eyeNum = 2;
		System.out.println(Person.eyeNum);
		Person p = new Person();
		p.name = "猪八戒";
		p.age = 300;
		System.out.println(Person.eyeNum);
		p.info();
	}
}
