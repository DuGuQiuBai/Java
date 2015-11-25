package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Student,String>
 * 键：Student	学生对象 (林青霞,28)
 * 		name,age
 * 值：String		学号 	eg:it001
 * 要求存储三个学生，并遍历。遍历的结果是：
 * 		林青霞---28---it001
 * 需求：如果两个学生对象的成员变量值都相同，我们就认为这是同一个对象，也就是说这是重复的键。
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		// 创建集合
		HashMap<Student, String> hm = new HashMap<Student, String>();

		// 创建对象
		Student s1 = new Student("林青霞", 28);
		Student s2 = new Student("风清扬", 31);
		Student s3 = new Student("王重阳", 200);
		Student s4 = new Student("林青霞", 28);
		Student s5 = new Student("风清扬", 20);
		Student s6 = new Student("王阳", 100);

		// 添加元素
		hm.put(s1, "it001");
		hm.put(s2, "it002");
		hm.put(s3, "it003");
		hm.put(s4, "it004");
		hm.put(s5, "it005");
		hm.put(s6, "it006");

		// 遍历集合
		Set<Student> set = hm.keySet();
		for (Student key : set) {
			String value = hm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---"
					+ value);
		}
	}
}
