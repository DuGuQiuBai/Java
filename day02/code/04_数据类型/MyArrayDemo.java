import java.util.Scanner;

class MyArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入三个数据：");
		int[] arr;
		int i = 0;
		arr = new int[3];
		System.out.println(arr);

		while(true) {
			arr[i] = sc.nextInt();
			i++;
			if (i >= arr.length) {
				break;
			}
		}

		/*
		for (i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			//System.out.println(arr[i]);
		}
		*/

		for (int j=0; j<arr.length; j++) {
		System.out.println("arr[" +j +"]=" +arr[j]);
		}

		int temp = 0;
		for (int j=1; j<arr.length; j++) {
			temp = arr[j-1]>=arr[j]?arr[j-1]:arr[j];
		}
		System.out.println("arr数组中最大值为：" +temp);
	}
}
