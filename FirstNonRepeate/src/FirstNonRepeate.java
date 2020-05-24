
public class FirstNonRepeate {

	public static void main(String[] args) throws Exception {

		String s = "bhaskABrh";
		int i = firstNonRepeate(s);
		if (i >= 0) {
			System.out.println("GIVEN STRING NON REPEATED CHARACTER ::" + s.charAt(i));
		} else {
			System.out.println("GIVEN STRING ALL CHARACTER ARE REPEATED");
		}
	}
	

	private static int firstNonRepeate(String s) {
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
					index = i;
					break;
				}
			}
			if (index == -1) {
				index = i;
				break;
			}
			index = -1;
		}

		return index;
	}
}
