/*
	方法重写：子类中出现了和父类中一模一样的方法声明，也被称为方法覆盖，方法复写
*/
//手机
/*
class Phone {
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}
}

//新款手机
class NewPhone {
	public void call(String name) {
		System.out.println("听彩铃");
		System.out.println("给"+name+"打电话");
	}
}

class PhoneDemo {
	public static void main(String[] args) {
		//手机
		Phone p = new Phone();
		p.call("林青霞");
		System.out.println("-----------");
	
		//新手机
		NewPhone np = new NewPhone();
		np.call("林青霞");
	}
}
*/

class Phone {
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}
}

class NewPhone extends Phone {
	public void call(String name) {
		System.out.println("听彩铃");
		//System.out.println("给"+name+"打电话");
		super.call(name);
	}
}

class PhoneDemo {
	public static void main(String[] args) {
		//手机
		Phone p = new Phone();
		p.call("林青霞");
		System.out.println("-----------");
	
		//新手机
		NewPhone np = new NewPhone();
		np.call("林青霞");
	}
}