package leet.code;

public class GoalParser {
	public static String interpret(String command) {
		String s2 = command.replace("()", "o");

		s2 = s2.replace("(al)", "al");
		return s2;

	}

	public static void main(String[] args) {
		String command = "G()()()()(al)";
		System.out.println(interpret(command));
	}

}
