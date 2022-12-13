import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class One {

	public static int solveFirst(String input) {
		int max = 0;
		int sum = 0;
		for (var line : input.lines().toList()) {
			if (line.equals("")) {
				sum = 0;
				continue;
			}

			sum += Integer.parseInt(line);
			max = Math.max(sum, max);
		}

		return max;
	}
	public static int solveSecond(String input) {
		ArrayList<Integer> topThree = new ArrayList<>(List.of(0,0,0));
		int sum = 0;
		for (var line : input.lines().toList()) {
			if (line.equals("")) {
				if (sum > topThree.get(0)) {
					topThree.set(0, sum);
					topThree.sort(Comparator.naturalOrder());
				}
				sum = 0;
				continue;
			}

			sum += Integer.parseInt(line);
		}

		if (sum > topThree.get(0)) {
			topThree.set(0, sum);
			topThree.sort(Comparator.naturalOrder());
		}

		return topThree.stream().reduce(0, Integer::sum);
	}
}
