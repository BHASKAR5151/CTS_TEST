
public class FindSecond {

	public static void main(String args[]) {

		int[] arr = { 2, 1, 7, 4, 9, 5 };

		int number = _findSmallNumber(arr, 2);
		System.out.println("Second Smallest Number :: " + number);

	}

	private static int _findSmallNumber(int[] arr, int givenNum) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j-1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr[givenNum - 1];
	}

}
