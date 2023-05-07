package Codeup;

import java.util.Scanner;


public class C1029 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double b = sc.nextDouble(); //nextdouble로 입력받아야함 아니면 큰자리수 받을떄 오류남
    String c = String.format("%.11f", b);
    System.out.println(c);



  }

}
