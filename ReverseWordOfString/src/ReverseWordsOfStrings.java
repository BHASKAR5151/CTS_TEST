public class ReverseWordsOfStrings {

	static String reverse(String str) {
		String s[] = str.split(" ");
		String result = "";
		for(int i= s.length-1; i>=0;i--) {
			result += s[i];
			result += " ";
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "Hi bhaskar reddy";
		System.out.println("Reverse of the string is: " + reverse(str));
	}
	
}
