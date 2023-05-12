package Codeup;

//
import java.util.Scanner;
import java.util.Stack;

public class C1094 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();

    int n = sc.nextInt();


    for (int i = 0; i < n; i++) {
      stack.push(sc.nextInt());
    }


    for (int i = 0; i < n; i++) {
      System.out.print(stack.pop() + " ");
    }



  }
}

