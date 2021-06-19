package codes0221;

/**
 * 类变量的初始化在实例变量的初始化之前
 * @author 89749
 *
 * 2018年4月7日
 */
public class RightDef {
	// 下面代码将完全正常
	int num1 = num2 + 1;
	static int num2 = 20;
}
