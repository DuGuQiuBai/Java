package cn.itcast_10;

import java.io.Serializable;

/*
 * NotSerializableException:未实现序列化接口异常。
 * Serializable：类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 * 
 * 如果以后你再看到接口没有方法的现象，请问该接口有什么用呢?
 * 有。这种接口被称为标记接口。
 * 
 * Exception in thread "main" java.io.InvalidClassException: 
 * cn.itcast_10.Person; local class incompatible: 
 * stream classdesc serialVersionUID = -1509474945256457713, 
 * local class serialVersionUID = -8199609520215381056
 * 
 * A:被序列化流操作的对象所属的类必须实现序列化接口。
 * B:一个java文件，在生存class文件的时候，也会有一个序列化id值，在序列化到文件的时候，它会把这个id值写到文件。
 * 		Person.java		id=100
 * 		Person.class	id=100
 * 		oos.txt			id=100
 * C:一但这个java文件做了修改，这个id值就会相应的发生改变
 * 		Person.java		id=200
 * 		Person.class 	id=200
 * 		oos.txt			id=100
 * 有些时候，我们做了一些简单的修改，不想在重新写数据，有没有办法保证读取数据不报错呢?
 * 有。让每次产生的id值是固定的就可以了。
 * 问题是，如何给出这个id值呢?它是怎么表示的呢?
 * 不知道?就点击鼠标即可。
 * 这个时候，我们就知道这个id值的表现形式了，而且还解决了黄色警告线的问题。
 * 
 * 序列化：
 * 		把对象按照流一样的形式写到文件或者在网络中传输
 * 反序列化：
 * 		把流数据还原成对象
 * 如何是实现序列化?
 * 		让被序列化的对象所属的类实现序列化接口
 * 如何让小的改动不影响以前序列化的数据以及类实现序列化出现的黄色警告线?
 * 		点击鼠标，生成一个固定的序列化id值即可
 */
public class Person implements Serializable {
	private static final long serialVersionUID = 8535379254621922917L;

	private String name;

	// private int age;

	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
