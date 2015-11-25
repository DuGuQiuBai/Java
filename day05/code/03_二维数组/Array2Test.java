/*
	二维数组遍历
*/
class Array2Test {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

		for(int x=0; x<arr.length; x++) {
			//System.out.println(arr[x]);
			/*
			int[] a = arr[x];
			for(int y=0; y<a.length; y++) {
				System.out.print(a[y]+" ");
			}
			System.out.println();
			*/

			for(int y=0; y<arr[x].length; y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}
