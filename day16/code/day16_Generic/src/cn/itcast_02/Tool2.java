package cn.itcast_02;

/*
 * 泛型类：把泛型定义在类上。
 * 格式：
 * 		class 类名<类型,...> {}
 */
public class Tool2<QQ> {
	private QQ qq;

	public QQ getQq() {
		return qq;
	}

	public void setQq(QQ qq) {
		this.qq = qq;
	}
}
