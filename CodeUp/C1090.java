package Codeup;

// 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하는 프로그램
import java.util.Scanner;

public class C1090 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    double d = Math.pow(b, (c - 1));

    System.out.println((long) (a * d));



  }
}

