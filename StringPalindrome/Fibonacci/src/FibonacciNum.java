class FibonacciNum {
	static int finsFibonanci(int num) {
		if (num <= 1)
			return num;
		return finsFibonanci(num - 1) + finsFibonanci(num - 2);
	}

	public static void main(String args[]) {
		int n = 11;
		System.out.println(finsFibonanci(n));
	}
}