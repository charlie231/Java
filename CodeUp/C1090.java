package Codeup;

// ���� ��(a), ���(r), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� �� n��° ���� ����ϴ� ���α׷�
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

