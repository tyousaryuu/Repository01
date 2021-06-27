package tt.ss.rr;

import java.util.ArrayList;

/**
 * 
 * @author 89749
 *
 * 2018年3月31日
 */
public class Java_00_020_01_5_ArrayList {

	public static void main(String[] args) {
		first();
		Goods goods = new Goods();
		goods.ID = 1;
		goods.name = "林寺酥饼核桃";
		goods.price = 15.5;
		goods.unit = "个";
	}

	/**
	 * ArrayList简单介绍
	 */
	private static void first() {
		ArrayList<String> list = new ArrayList<String>();
		String s = "我爱Java";
		String s2 = "我喜欢Java";
		list.add(s);					//向集合中添加索引为0的元素
		list.add(s2);					//向集合中添加索引为1的元素
		list.add("我与Java在一起");			//向集合中添加索引为2的元素

		String data = list.get(1);		//获取集合中索引为1的元素
		System.out.println(data);			//打印出出刚刚获取到的值

		for(int i=0 ; i<list.size() ; i++) {	//遍历集合
			System.out.println(list.get(i));
		}
	}

}
