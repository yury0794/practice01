package practice01;

public class Game369 {

	public static void main(String[] args) {
		// String -> int : Integer.parseInt(String)
		// int -> String : String.valueOf(int)
		for (int i = 1; i < 100; i++) {
			String s = String.valueOf(i);

			if (s.contains("3") || s.contains("6") || s.contains("9")) {
				System.out.print(i + " ");

				for (int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);

					if (c == '3' || c == '6' || c == '9') {
						System.out.print("짝");
					}
				}
				System.out.println();
			}
		}
	}
}