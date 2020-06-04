import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {12, 10, 71, 22, 49, 1, 6};
		
		System.out.print("Enter the element to be searched: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int result = linearSearch(arr, num);
		if(result >= 0)
			System.out.println("Number is present at index: "+ result);
		else
			System.out.println("Number is not present in the array.");
	}
	public static int linearSearch(int[] arr, int n) {
		for (int i =0; i<arr.length; i++) {
			if(arr[i] == n)
				return i;
		}
		return -1;
	}

}
