package Codeup;

import java.util.Scanner;

public class C1048 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    double c = Math.pow(2, b); // double로 형 고정 후 Math.pow(밑,지수)
    System.out.println((int) (a * c));

  }
}
