//手机类的定义
class Phone {
	//品牌
	String brand;
	//价格
	int price;
	//颜色
	String color;

	//打电话的方法
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}

	//发短信
	public void sendMessage() {
		System.out.println("群发短信");
	}
}

class PhoneDemo3 {
	public static void main(String[] args) {
		Phone p = new Phone();
		//成员变量赋值并使用不讲了
		//方法调用不讲了

		Phone p2 = new Phone();
		//成员变量赋值并使用不讲了
		//方法调用不讲了

		Phone p3 = p;
		p3.brand = "魅族";
		p3.price = 1999;
		p3.color = "白色";
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
	}
}
