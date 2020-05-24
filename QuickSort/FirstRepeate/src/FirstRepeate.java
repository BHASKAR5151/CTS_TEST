
public class FirstRepeate {

	public static void main(String[] args) throws Exception {

		String s = "bhaskAr";
		int i = findFirstChar(s);
		if (i >= 0) {
			System.out.println("FIRST REPEATED :: " + s.charAt(i));
		} else {
			System.out.println("GIVEN STRING DOESN'T HAVE REPEATED CHARACTER");
		}
	}

	private static int findFirstChar(String s) {
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
					index = i;
					break;
				}
			}
			if (index != -1) {
				break;
			}
		}

		return index;
	}
}
