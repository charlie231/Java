package Codeup;

// ���� ��(a), ���� ��(m), ���� ��(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��, n��° ���� ����ϴ� ���α׷�
import java.util.Scanner;

public class C1091 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int m = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();

    long pre = 0;
    long count = a;

    for (int i = 0; i < n - 1; i++) {
      pre = (count * m) + d;
      count = pre;
    }
    System.out.println(count);



  }
}

