import java.util.HashMap;
import java.util.Map;

public class LastNonRepeate {

	public static void main(String[] args) throws Exception {

		String givenStr = "bhbhaskarre";
		Character c = lastNonrepeate(givenStr);
		if (c == null) {
			System.out.println("No character found.");
		} else {
			System.out.println("Last non repeating character is " + c);
		}
	}

	private static Character lastNonrepeate(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int j = s.length()-1; j > 0; j--) {
			if (map.get(s.charAt(j)) == 1) {
				return s.charAt(j);
			}
		}

		return null;
	}

}
