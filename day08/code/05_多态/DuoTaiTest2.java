class A{
	public void show(){	
		show2();
	}
	public void show2(){
		System.out.println("ÎÒ");
	}
}
class B extends A {
	public void show2(){
		System.out.println("°®");
	}
}
class C extends B {
	public void show(){
		super.show();
	}
	
	public void show2(){
		System.out.println("Äã");
	}
}

class DuoTaiTest2 {
	public static void main(String[] args) {
		A a = new B();
		a.show();
		B b = new C();
		b.show();
	}
}
