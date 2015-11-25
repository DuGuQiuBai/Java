/*
	选择结构：if语句，switch语句。

	if语句有三种格式。

	if语句格式1：
		if(关系表达式) {
		     语句体;
		}

	执行流程：
		A:计算关系表达式，看其结果
		B:如果是true，就执行语句体
		  如果是false，就不执行语句体
		C:继续向下执行
*/
class IfDemo {
	public static void main(String[] args) {
		int x = 3;

		if(x == 3) {
			System.out.println("x等于3");
			//x = 10;
		}

		if(x > 5) {
			System.out.println("x大于5");	
		}

		System.out.println("over");
	}
}