import java.nio.charset.StandardCharsets;

public class Two {

	public static int solveFirst(String input) {
		int sum = 0;
		for (var line : input.lines().toList()) {
			var moves = line.split(" ");
			var opp = moves[0].getBytes(StandardCharsets.UTF_8);
			var you = moves[1].getBytes(StandardCharsets.UTF_8);
			if (opp[0] == 'A' && you[0] == 'X') {sum += 4;}
			if (opp[0] == 'B' && you[0] == 'X') {sum += 1;}
			if (opp[0] == 'C' && you[0] == 'X') {sum += 7;}
			if (opp[0] == 'A' && you[0] == 'Y') {sum += 8;}
			if (opp[0] == 'B' && you[0] == 'Y') {sum += 5;}
			if (opp[0] == 'C' && you[0] == 'Y') {sum += 2;}
			if (opp[0] == 'A' && you[0] == 'Z') {sum += 3;}
			if (opp[0] == 'B' && you[0] == 'Z') {sum += 9;}
			if (opp[0] == 'C' && you[0] == 'Z') {sum += 6;}
		}
		return sum;
	}

	public static int solveSecond(String input) {
		int sum = 0;
		for (var line : input.lines().toList()) {
			var moves = line.split(" ");
			var opp = moves[0].getBytes(StandardCharsets.UTF_8);
			var you = moves[1].getBytes(StandardCharsets.UTF_8);
			if (opp[0] == 'A' && you[0] == 'X') {sum += 3;}
			if (opp[0] == 'B' && you[0] == 'X') {sum += 1;}
			if (opp[0] == 'C' && you[0] == 'X') {sum += 2;}
			if (opp[0] == 'A' && you[0] == 'Y') {sum += 4;}
			if (opp[0] == 'B' && you[0] == 'Y') {sum += 5;}
			if (opp[0] == 'C' && you[0] == 'Y') {sum += 6;}
			if (opp[0] == 'A' && you[0] == 'Z') {sum += 8;}
			if (opp[0] == 'B' && you[0] == 'Z') {sum += 9;}
			if (opp[0] == 'C' && you[0] == 'Z') {sum += 7;}
		}
		return sum;
	}

}
