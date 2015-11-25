/*
	if语句格式2：
		if(关系表达式) {
		     语句体1;
		}else {
			 语句体2;
		}

	执行流程：
		A:计算关系表达式的值。
		B:如果是true，就执行语句体1
		  如果是false，就执行语句体2
		C:继续向下执行
*/
class IfDemo3 {
	public static void main(String[] args) {
		int x = 3;

		if(x == 3) {
			System.out.println("x等于3");
		}else {
			System.out.println("x不等于3");
		}

		if(x > 5) {
			System.out.println("x大于3");
		}else {
			System.out.println("x不大于5");
		}
	}
}