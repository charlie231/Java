package Codeup;

// ���׿����� �̿� ���� ������ ���
import java.util.Scanner;

public class C1064 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int d = (a < b) && (a < c) ? (a) : (a > b) && (c > b) ? (b) : (c);


    System.out.println(d);



  }
}

