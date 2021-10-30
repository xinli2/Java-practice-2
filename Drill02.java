import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Drill02 {
	
	// -------- Stacks/Queues

	// Given a stack as input, return a stack that has the
	// same values in reverse order.
	static Stack<Integer> reverseStack(Stack<Integer> in) {
		Stack<Integer> result = new Stack<Integer>();
		while (!in.empty()) {
			result.push(in.pop());
		}
		return result;
	}

	// Given a queue, return a new queue that has the
	// same values in reverse order
	static Queue<Integer> reverseQueue(Queue<Integer> in) {
		Queue<Integer> result = new LinkedList<>();
		Stack<Integer> temp = new Stack<Integer>();
		while (!in.isEmpty()) {
			temp.push(in.remove());	
		}
		while (!temp.empty()) {
			result.add(temp.pop());
		}
		return result;
	}
	
	
	// -------- Recursion

    // takes a number of characters to print as a parameter
    // returns a string with one or two asterisks in the middle
    // surrounded by alligators
	// See the README
    public static String zigzag(int n) {
    	if (n == 1) {
    		return "*";
    	}
    	else if (n == 2) {
    		return "**";
    	}
    	else {
    		return "<" + zigzag(n - 2) + ">";
    	}
    }

    // takes a string and a character as parameters and returns 
    // the string with all copies of the character moved to the 
    // end and capitalized
    // See the README
    public static String moveToEnd(String s, char c) {
    	if (s.length() == 0) {
    		return "";
    	}
    	else {
    		String temp = s.substring(1);
    		if (s.toLowerCase().charAt(0) == Character.toLowerCase(c)) {
    			return moveToEnd(temp, c) + Character.toUpperCase(s.charAt(0));
    		}
    		else {
    			return s.charAt(0) + moveToEnd(temp, c);
    		}
    	}
    }

}
