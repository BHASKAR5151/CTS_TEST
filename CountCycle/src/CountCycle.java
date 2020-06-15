
public class CountCycle {

	private static int countCycles(int[] arr) {
		int index = 0;
		int count = 0;
		int countArr[] = new int[arr.length];
		while (countArr[index] == 0) {
			countArr[index] = count++;
			index = arr[index];
		}
		return count - countArr[index];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 6, 0, 5, 1 };

		System.out.println("Count of cycle is: " + countCycles(arr));
	}

}
