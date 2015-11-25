/*
	需求：
*/

class Array2Sum {
	public static void main(String[] args) {
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				sum +=arr[i][j];
			}
		}
		System.out.println("总数为：" +sum);
	}
}
