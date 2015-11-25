package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;

/*
 *泛型高级：
 *泛型通配符<?>
 *		任意类型，如果没有明确，那么就是Object以及任意的Java类了
 *? extends E
 *		向下限定，E及其子类
 *? super E
 *		向上限定，E及其父类
 */
public class GenericeDemo {
	public static void main(String[] args) {
		// 泛型通配符<?>
		Collection<?> c1 = new ArrayList<Animal>();
		Collection<?> c2 = new ArrayList<Dog>();
		Collection<?> c3 = new ArrayList<Cat>();
		Collection<?> c4 = new ArrayList<Object>();
		System.out.println("--------------------");

		// ? extends E
		Collection<? extends Animal> c5 = new ArrayList<Animal>();
		Collection<? extends Animal> c6 = new ArrayList<Dog>();
		Collection<? extends Animal> c7 = new ArrayList<Cat>();
		// Collection<? extends Animal> c8 = new ArrayList<Object>();
		System.out.println("--------------------");

		// ? super E
		Collection<? super Animal> c9 = new ArrayList<Animal>();
		// Collection<? super Animal> c10 = new ArrayList<Dog>();
		// Collection<? super Animal> c11 = new ArrayList<Cat>();
		Collection<? super Animal> c12 = new ArrayList<Object>();
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}