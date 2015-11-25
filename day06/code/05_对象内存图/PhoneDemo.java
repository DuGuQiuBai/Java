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

class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();

		//使用成员变量
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
		System.out.println("----------------");

		//给成员变量赋值
		p.brand = "三星";
		p.price = 2999;
		p.color = "蓝色";

		//再次使用成员变量
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
		System.out.println("----------------");

		//调用成员方法
		//String name = "林青霞";
		//p.call(name);
		p.call("林青霞");
		p.sendMessage();
	}
}