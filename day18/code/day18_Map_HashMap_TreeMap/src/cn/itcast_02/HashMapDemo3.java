package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<String,Student>
 * 键：String		学号 	eg:itcast001
 * 值：Student	学生对象 (林青霞,28)
 * 		name,age
 * 要求存储三个学生，并遍历。遍历的结果是：
 * 		itcast001--林青霞---28
 * 		...
 */
public class HashMapDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, Student> hm = new HashMap<String, Student>();

		// 创建对象
		Student s1 = new Student("林青霞", 28);
		Student s2 = new Student("风清扬", 31);
		Student s3 = new Student("王重阳", 200);

		// 添加元素
		hm.put("itcast001", s1);
		hm.put("itcast002", s2);
		hm.put("itcast003", s3);

		// 遍历
		Set<String> set = hm.keySet();
		for (String key : set) {
			Student value = hm.get(key);
			System.out.println(key + "---" + value.getName() + "---"
					+ value.getAge());
		}
	}
}
