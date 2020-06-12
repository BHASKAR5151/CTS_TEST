import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunLength1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = input.next();
		findtheLength(s);

	}

	private static void findtheLength(String s) {
		Map<Character, Integer> map = new HashMap<>();
		if (!s.equals(" ") && !s.isEmpty() && s != null) {
			for (int i = 0; i <= s.length() - 1; i++) {

				if (map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
				} else {
					map.put(s.charAt(i), 1);
				}
			}
		} else {
			System.out.println("should be blank");
		}
		map.forEach((key, value) -> {
		    System.out.println("Key : " + key + " Value : " + value);
		});
		
			}
}