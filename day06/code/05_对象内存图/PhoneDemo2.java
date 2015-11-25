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

class PhoneDemo2 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "诺基亚";
		p.price = 299;
		p.color = "土豪金";
		//使用成员变量
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
		p.call("林青霞");
		p.sendMessage();

		Phone p2 = new Phone();
		p2.brand = "小米";
		p2.price = 699;
		p2.color = "黑白";
		//使用成员变量
		System.out.println("品牌是："+p2.brand);
		System.out.println("价格是："+p2.price);
		System.out.println("颜色是："+p2.color);
		p2.call("刘亦菲");
		p2.sendMessage();
	}
}
