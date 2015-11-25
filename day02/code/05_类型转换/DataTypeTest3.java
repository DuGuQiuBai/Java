class DataTypeTest3 {
	public static void main(String[] args) {
		byte b = (byte)300;
		System.out.println(b);


		System.out.println((byte)127);
		System.out.println((byte)128);
		System.out.println((byte)129);
		System.out.println((byte)130);
		System.out.println((byte)131);
	}
}

/*
	十进制：300

	A:把十进制转换为二进制
		00000000 00000000 00000001 00101100

	B:截取
		0 0101100
*/