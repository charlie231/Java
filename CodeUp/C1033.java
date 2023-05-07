package Codeup;

import java.util.Scanner;

public class C1033 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    String b = String.format("%x", a);



    System.out.println(b.toUpperCase()); // 소문자 > 대문자

  }
}
