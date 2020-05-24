class SmallestSub {
	static int smallestSubWithSum(int arr[], int n, int x) {
		int min_len = n + 1;

		for (int start = 0; start < n; start++) {
			int curr_sum = arr[start];
			if (curr_sum > x)
				return 1;
			for (int end = start + 1; end < n; end++) {
				curr_sum += arr[end];
				if (curr_sum > x && (end - start + 1) < min_len)
					min_len = (end - start + 1);
			}
		}
		return min_len;
	}

	public static void main(String[] args) {
		
		int arr3[] = { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
		int n3 = arr3.length;
		int x = 280;
		int res3 = smallestSubWithSum(arr3, n3, x);
		if (res3 == n3 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res3);
	}
}