package cn.itcast_02;

/*
 * 实现类在实现泛型接口的时候：
 * A:在实现接口的时候，我已经明确了接口的泛型参数类型
 * B:在实现接口的时候，我还不知道接口的泛型参数类型
 */
//public class InterImpl implements Inter<String> {
//	@Override
//	public void show(String yy) {
//		System.out.println(yy);
//	}
// }

public class InterImpl<YY> implements Inter<YY> {
	@Override
	public void show(YY yy) {
		System.out.println(yy);
	}
}

// new InterImpl<String>();