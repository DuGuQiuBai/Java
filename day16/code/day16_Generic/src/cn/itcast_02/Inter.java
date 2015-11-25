package cn.itcast_02;

/*
 * 泛型接口：把泛型定义在接口上
 * 
 * 格式：
 * 		interface 接口名<泛型类型,...>
 */
public interface Inter<YY> {
	public abstract void show(YY yy);
}
