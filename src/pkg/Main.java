package pkg;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public int solution(String str) {
	
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(!stack.isEmpty() && stack.peek() == x) stack.pop();
			else stack.push(x);
		}
		
		return stack.isEmpty() ? 1 : 0;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
