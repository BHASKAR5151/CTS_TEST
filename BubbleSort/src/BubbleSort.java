
public class BubbleSort {

	public static void main(String args[]) {

		int[] arr = { 2, 1, 7, 4, 9, 5 };
		bubbleSort(arr);
		System.out.println("Bubble Sort Array :: ");
		for (int i = 0; i < arr.length; i++) {
		System.out.println(""+arr[i]);
		}
	}

	private static void bubbleSort(int[] arr) {
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
		
	}

}
