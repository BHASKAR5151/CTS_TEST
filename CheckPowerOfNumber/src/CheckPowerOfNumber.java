public class CheckPowerOfNumber {
	public static void main(String[] args) {
		System.out.println(isPower(10, 1000) ? "YES IT IS " : "NO IT IS NOT");
	}

	public static boolean isPower(int x, int y) {
		if (x == 1)
			return (y == 1);

		int pow = 1;
		while (pow < y)
			pow = pow * x;

		return (pow == y);
	}
}