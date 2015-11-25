package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Object[] toArray():把集合转成对象数组
 * 
 * 练习：用集合存储三个学生对象，并遍历。
 * 
 * 总结：集合的使用步骤
 * A:创建集合对象
 * B:创建元素对象
 * C:把元素添加到集合
 * D:遍历集合
 */
public class CollectionTest {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建元素对象
		Student s1 = new Student("林黛玉", 18);
		Student s2 = new Student("秦可卿", 20);
		Student s3 = new Student("王熙凤", 22);

		// 把学生对象添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		// c.add(new Student("贾宝玉", 20));

		// 遍历集合
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			Student s = (Student) objs[x];
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
