package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 练习：用集合存储三个学生对象，并遍历。使用迭代器遍历
 */
public class IteratorTest {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建元素对象
		Student s1 = new Student("孙悟空", 30);
		Student s2 = new Student("紫霞仙子", 26);
		Student s3 = new Student("嫦娥", 22);

		// 把元素添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);

		// 遍历集合
		// 通过集合对象调用iterator()方法获取迭代器对象
		Iterator it = c.iterator();
		// 通过迭代器对象的hasNext()方法进行判断是否有元素
		while (it.hasNext()) {
			// 通过迭代器对象的next()方法获取元素,并转换为你存储的元素类型
			Student s = (Student) it.next();
			// 直接输出对象的名称，输出的是地址值，没有什么意义。
			// 如何解决呢?A:重写对象所属类的toString()方法。B:通过对象调用getXxx()方法
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
