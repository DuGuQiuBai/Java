/*
	定义一个长方形类,定义求周长和面积的方法，然后定义一个测试了Test，进行测试。
*/
class ChangFangXing {
	private int length;
	private int width;

	public ChangFangXing() {}

	public ChangFangXing(int length,int width) {
		this.length = length;
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public int zhouChang() {
		return (length+width)*2;
	}

	public int area() {
		return length*width;
	}
}

class Test {
	public static void main(String[] args) {
		//无参
		ChangFangXing cfx = new ChangFangXing();
		cfx.setLength(100);
		cfx.setWidth(50);
		System.out.println("周长是："+cfx.zhouChang());
		System.out.println("面积是："+cfx.area());

		//带参
		ChangFangXing cfx2 = new ChangFangXing(100,50);
		System.out.println("周长是："+cfx2.zhouChang());
		System.out.println("面积是："+cfx2.area());
	}
}