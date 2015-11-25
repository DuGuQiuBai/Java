/*
	强制转换:从大到小，不建议使用，因为可能有精度的丢失。
		目标类型 变量名=(目标类型)(被转换的数据);
*/
class DataTypeDemo2 {
	public static void main(String[] args) {
		//定义变量
		byte by = 3;
		int i = 4;
		byte bb = (byte)(by + i);
		System.out.println(bb);
	}
}