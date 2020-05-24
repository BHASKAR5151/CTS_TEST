
public class LastRepeate {

	public static void main(String[] args) throws Exception {

		String s = "BHASKabRS";
		int i = lastRepeate(s);
		if (i >= 0) {
			System.out.println("GIVEN STRING LAST REPEATED CHARACTER ::" + s.charAt(i));
		} else {
			System.out.println("GIVEN STRING DOES'T HAVE REPEATED CHARACTER");
		}
	}

	private static int lastRepeate(String s) {
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
					index = i;
					break;
				}
			}
		}

		return index;
	}
}
