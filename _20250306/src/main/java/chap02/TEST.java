package chap02;


public class TEST {
	public static int max = 0;
	public static int recursive(int[] a, int n) {
		if(n==1) return max;
		max = recursive(a, n-1);
		if(max > a[n-1]) return max;
		else return a[n-1];
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 123, 24};
		int result = recursive(arr, arr.length);
		System.out.println(result);
	}
}
