package Codeup;

// �Է¹��� �� ������ �� ���
import java.util.Scanner;

public class C1085 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= a; i++) {
      sum += i;
      if (sum >= a) {
        break;
      }
    }
    System.out.println(sum);



  }
}
