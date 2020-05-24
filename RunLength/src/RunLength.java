public class RunLength {
	public static void printRLE(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {

			int count = 2;
			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			System.out.print(str.charAt(i));
			System.out.print(count);
		}
	}

	public static void main(String[] args) {
		String str = "sdfsfcvxwer";
		printRLE(str);
	}
}