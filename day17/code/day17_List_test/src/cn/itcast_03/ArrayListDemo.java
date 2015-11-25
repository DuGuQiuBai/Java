package cn.itcast_03;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 集合对象的toString()是如何实现的
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");

		System.out.println(array.toString()); // [hello, world, java]
	}
}
/*
public String toString() {
	//this -- array
    Iterator<E> it = this.iterator();
    if (! it.hasNext())
        return "[]";

    StringBuilder sb = new StringBuilder();
    sb.append('[');
    for (;;) {
        E e = it.next();
        sb.append(e == this ? "(this Collection)" : e);
        if (! it.hasNext())
            return sb.append(']').toString();
        sb.append(',').append(' ');
    }
}
*/