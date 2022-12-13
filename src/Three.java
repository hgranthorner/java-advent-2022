import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Three {

    public static int solveFirst(String input) {
        int sum = 0;
        for (var line : input.lines().toList()) {
            var firstHalf = line.substring(0, line.length() / 2).toCharArray();
            var first = new HashSet<Character>(firstHalf.length);
            for (var c : firstHalf) {
                first.add(c);
            }
            var secondHalf = line.substring(line.length() / 2).toCharArray();
            var second = new HashSet<Character>();
            for (var c : secondHalf) {
                second.add(c);
            }
            first.retainAll(second);
            char common = first.stream().findFirst().get();

            if (Character.isLowerCase(common)) {
                sum += common - 'a';
            } else {
                sum += common - 'A';
                sum += 26;
            }

            sum += 1;
        }

        return sum;
    }

    public static int solveSecond(String input) {
        int sum = 0;
        ArrayList<String> currentGroup = new ArrayList<>(3);
        for (var line : input.lines().toList()) {
            currentGroup.add(line);
            if (currentGroup.size() != 3) {
                continue;
            }

            var sets = currentGroup.stream().map(String::toCharArray).map(Three::arrayToSet).toList();
            sets.get(0).retainAll(sets.get(1));
            sets.get(0).retainAll(sets.get(2));
            char common = sets.get(0).stream().findFirst().get();

            if (Character.isLowerCase(common)) {
                sum += common - 'a';
            } else {
                sum += common - 'A';
                sum += 26;
            }

            sum += 1;


            currentGroup.clear();
        }

        return sum;
    }

    public static HashSet<Character> arrayToSet(char[] arr) {
        var set = new HashSet<Character>();
        for (var el : arr) {
            set.add(el);
        }
        return set;
    }
}
