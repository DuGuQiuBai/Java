/*
	如何访问子类特有功能呢?
		A:创建子类对象即可。
		B:多态的转型问题
			向上转型
				从子到父
				父类引用指向子类对象
			向下转型
				从父到子
				父类引用转为子类对象

	孔子装爹案例

		孔子：教书():讲论语,玩游戏():连连看,age:20
		孔子爹：教书():JavaSE，age:40

		//多态
		孔子爹 k爹 = new 孔子(); //Android很火，而JavaSE是Android基础，所以JavaSE很火。
								 //爹太忙，儿子装爹去讲课。粘上小胡子，带上眼镜。向上转型
		System.out.println(k爹.age); //40
		k爹.教书(); //讲论语
		//k爹.玩游戏(); //报错

		//回家了
		孔子 k = (孔子)k爹; //去掉小胡子，去掉眼镜。向下转型
		System.out.println(k.age); //20
		k.教书(); //讲论语
		k.玩游戏();
*/
class  Animal {
	public void eat(){}
}

class Dog extends Animal {
	public void eat(){
		System.out.println("狗吃骨头");
	}
	
	public void help() {
		System.out.println("狗可以帮助警察叔叔抓小偷");
	}
}

class Cat extends Animal {
		public void eat(){
			System.out.println("猫吃老鼠");
		}
}

class DuoTaiDemo2 {
	public static void main(String[] args) {
		//多态
		Animal a = new Dog();	//向上转型
		a.eat();
		//a.help(); //编译看左边

		//向下转型
		Dog d = (Dog)a;
		d.eat();
		d.help();
		System.out.println("-------------");

		//会报错吗?
		a = new Cat(); ////向上转型
		a.eat();

		Cat c = (Cat)a;
		c.eat();

		//Dog dd = (Dog)a; //ClassCastException
		//dd.eat();
		//dd.help();
	}
}