/*
	if语句注意事项：
		A:关系表达式无论简单还是复杂，结果必须是boolean类型
		B:在做判断的时候，建议常量放左边。
		C:if语句控制的语句体如果是一条语句，大括号可以省略；
		  如果是多条语句，就不能省略。建议永远不要省略
		D:一般来说：有左大括号就没有分号，有分号就没有左大括号
*/
class IfDemo2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;

		if(x > y) {
			System.out.println("hello");
		}

		//这里不是boolean类型
		/*
		if(30) {
			System.out.println("world");
		}
		*/
		
		if(true) {
			System.out.println("java");
		}

		if(x<y && x<z) {
			System.out.println("android");
		}
		System.out.println("-----------");

		boolean flag = false;
		/*
		if(flag == true) {
			System.out.println("javaweb");
		}
		*/
		
		/*
		if(flag = true) {
			System.out.println("javaweb");
		}
		*/
		
		/*
		if(true = flag) {
			System.out.println("javaweb");
		}
		*/
		System.out.println("-----------");

		if(false) {
			System.out.println("haha");
			System.out.println("hehe");
		}

		System.out.println("heihei");

		System.out.println("-----------");

		if(false);

		//代码块
		{
			System.out.println("111");
			System.out.println("222");
		}
		System.out.println("over");
	}
}
