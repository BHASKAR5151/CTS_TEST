class Fact {
	
	public static void main(String args[]) {
		int i, fact = 1;
		int number = 8;
		fact = factorial(number);
		System.out.println("Factorial of Given Number" + number + " is: " + fact);
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}