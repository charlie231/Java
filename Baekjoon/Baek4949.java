import java.util.Scanner;
import java.util.Stack;

public class Baek4949 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String b;

    while (true) {
      b = sc.nextLine();

      if (b.equals(".")) {
        break;
      }
      System.out.println(solve(b));
    }
  }

  public static String solve(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '[') {
        stack.push(c);
      }

      else if (c == ')') {
        if (stack.empty() || stack.peek() != '(') {
          return "no";
        } else {
          stack.pop();
        }
      }

      else if (c == ']') {
        if (stack.empty() || stack.peek() != '[') {
          return "no";
        } else {
          stack.pop();
        }
      }


    }


    if (stack.empty()) {
      return "yes";
    } else {
      return "no";
    }
  }


}
