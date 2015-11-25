/*
	定义一个类Demo,其中定义一个求两个数据和的方法，定义一个测试了Test，进行测试。

	什么时候定义成员变量呢?
	要想知道在类中什么时候定义成员变量，就应该先思考成员变量和类的关系?
	成员变量是描述类的基本信息的。
	也就是说，只有和类有关系的变量才可以定义为成员变量。
*/
class Demo {
	private int x;
	private int y;

	public Demo() {}

	public Demo(int x,int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	//成员变量已经有x,y了。这里就没有必要在定义了
	/*
	public int sum(int x,int y) {
		return x + y;
	}
	*/

	public int sum() {
		return x + y;
	}
}

class Test {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setX(10);
		d.setY(20);
		int result = d.sum();
		System.out.println(result);
	}
}