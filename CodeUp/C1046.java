package Codeup;

import java.util.Scanner;

public class C1046 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    float d = (float) ((float) a + (float) b + (float) c) / 3;

    System.out.println(a + b + c);
    System.out.println(String.format("%.1f", d));
  }
}
