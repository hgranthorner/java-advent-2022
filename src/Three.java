public class Three {

	public static String solveFirst(String input) {
		for (var line : input.lines().toList()) {
			var first = line.substring(0, line.length() / 2);
			var second = line.substring(line.length() / 2, line.length());
		}
	}

}
