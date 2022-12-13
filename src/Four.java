import java.util.Arrays;

public class Four {
    public static int solveFirst(String input) {
        var total = 0;
        for (String line : input.lines().toList()) {
            var nums = Arrays.stream(line.split(","))
                    .flatMap(s -> Arrays.stream(s.split("-")))
                    .map(Integer::parseInt)
                    .toList();

            if (eitherEncompasses(nums.get(0), nums.get(1), nums.get(2), nums.get(3))) {
                total++;
            }
        }
        return total;
    }
    public static int solveSecond(String input) {
        return 0;
    }

    public static boolean eitherEncompasses(int min1, int max1, int min2, int max2) {
        return (min1 >= min2 && max1 <= max2) || (min1 <= min2 && max1 >= max2);
    }

    // TODO: Change this to check for any overlap between the two ranges
    public static boolean anyEncompasses(int min1, int max1, int min2, int max2) {
        return (min1 >= min2 && max1 <= max2) || (min1 <= min2 && max1 >= max2);
    }

}
