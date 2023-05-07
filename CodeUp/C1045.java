package Codeup;

import java.util.Scanner;

public class C1045 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    float c = (float) a / (float) b;


    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    System.out.println(String.format("%.2f", c));
    // System.out.println(String.format("%.2f", ((float) a / (float) (b))));
    // 이거써도 되긴하는데 변수 새로 만드는게 편함.


  }
}
