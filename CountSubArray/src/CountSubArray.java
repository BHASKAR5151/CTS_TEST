
public class CountSubArray {

	static int countSubarraysProductLessThanK(int[] arr, int k) {
		int result = 0;
		int prod = 1;
		int len = arr.length;
		int start = 0, end = 0;
		for (end = 0; end < len; end++) {
			prod = prod * arr[end];
			while (start < end && prod >= k)
				prod = prod / arr[start++];
			if (prod < k) {
				int count = end - start + 1;
				result = result + count;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 0, 9, 4, 3 };
		int k = 100;
		System.out.println("Subarrays with product less than " + k + " is " + countSubarraysProductLessThanK(arr, k));
	}

}
