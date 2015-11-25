package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 注意：next()没一次调用，都会获取一个对象，并移动到下一个位置等待。
 */
public class IteratorTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建元素对象
		Student s1 = new Student("孙悟空", 30);
		Student s2 = new Student("紫霞仙子", 26);
		Student s3 = new Student("嫦娥", 22);
		Student s4 = new Student("猪八戒", 18);

		// 把元素添加到集合
		c.add(s1); // Object obj = s1; 向上转型
		c.add(s2);
		c.add(s3);
		c.add(s4);

		Iterator it = c.iterator();
		while (it.hasNext()) {
			// System.out.println(((Student) (it.next())).getName() + "---"
			// + ((Student) (it.next())).getAge());
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
