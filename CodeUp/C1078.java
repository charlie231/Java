package Codeup;

// 0~�Է¹��� ���ڱ��� �� ¦���� ���� ���
import java.util.Scanner;

public class C1078 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {

      if (i % 2 == 0) {
        sum += i;
      } else {
        continue;
      }

    }
    System.out.println(sum);



  }
}

