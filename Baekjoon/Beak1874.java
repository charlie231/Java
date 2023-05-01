package Baek;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Beak1874 {
  static int i, T;
  static int j = 1;
  static StringBuilder sb = new StringBuilder();
  static boolean err = false;

  public static void main(String[] args) throws IOException {

    Stack<Integer> stack = new Stack<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());

      for (; j <= N; j++) {
        stack.push(j);
        sb.append("+").append("\n");
      }

      if (stack.peek() == N) {
        stack.pop();
        sb.append("-").append("\n");
      } else {
        err = true;
      }
    }

    if (err) {
      System.out.println("NO");
    } else {
      System.out.println(sb);
    }



  }

}
