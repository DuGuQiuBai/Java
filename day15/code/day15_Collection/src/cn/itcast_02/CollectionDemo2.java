package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c)
 * boolean removeAll(Collection c):删除一个，就是删除，返回true
 * boolean containsAll(Collection c):全部包含，才是包含。
 * boolean retainAll(Collection c)
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// 创建集合
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// 创建集合
		Collection c2 = new ArrayList();
		// c2.add("abc1");
		// c2.add("abc2");
		// c2.add("abc3");
		// c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// boolean addAll(Collection c)
		// System.out.println("addAll:" + c1.addAll(c2));

		// boolean removeAll(Collection c)
		// System.out.println("removeAll:" + c1.removeAll(c2));

		// boolean containsAll(Collection c)
		// System.out.println("containsAll:" + c1.containsAll(c2));

		// boolean retainAll(Collection c)
		System.out.println("retainAll:" + c1.retainAll(c2));
		/*
		 * 如果我有两个集合A，B。用A对B做交集 交集元素存储在A集合，B集合不发生改变。 返回值表达是A集合是否发生过改变。
		 */

		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
	}
}
