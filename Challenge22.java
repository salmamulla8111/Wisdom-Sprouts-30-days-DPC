package DPC;
/*import java.util.Stack;
class GFG {
	static void test(String expression, int index) {
		int i;
		if (expression.charAt(index) != '[') {
			System.out.print(expression + ", "
					+ index + ": -1\n");
			return;
		}
		Stack<Integer> st = new Stack<>();
		for (i = index; i < expression.length(); i++) {
			if (expression.charAt(i) == '[') {
				st.push((int) expression.charAt(i));
			}
			else if (expression.charAt(i) == ']') {
				st.pop();
				if (st.empty()) {
					System.out.print(expression + ", "
							+ index + ": " + i + "\n");
					return;
				}
			}
		}
		System.out.print(expression + ", "+ index + ": -1\n");
	}
	public static void main(String[] args) {
		test("[ABC[23]][89]", 0); 
		test("[ABC[23]][89]", 4); 
		test("[ABC[23]][89]", 9); 
		test("[ABC[23]][89]", 1); 
	}
}*/
import java.util.Stack;

public class Challenge22 {
    public static int findClosingBracketIndex(String input, int startIndex) {
        if (startIndex >= input.length() || input.charAt(startIndex) != '[') {
            return -1; // Invalid start index or not an open bracket
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = startIndex; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '[') {
                stack.push(i);
            } else if (c == ']') {
                if (!stack.isEmpty()) {
                    int openBracketIndex = stack.pop();
                    if (openBracketIndex == startIndex) {
                        return i; // Found the closing bracket
                    }
                } else {
                    return -1; // No matching open bracket
                }
            }
        }

        return -1; // No matching closing bracket
    }

    public static void main(String[] args) {
        String input = "[ABC[23]][89]";
        int startIndex = 9; // Change this to the desired start index

        int closingBracketIndex = findClosingBracketIndex(input, startIndex);
        if (closingBracketIndex != -1) {
            System.out.println("Closing bracket index: " + closingBracketIndex);
        } else {
            System.out.println("No matching closing bracket found.");
        }
    }
}
