package Codeup;

// 16������ ���ĺ��� �Է¹޾� �ش� ���ĺ��� 16���� ���ϴ� 16���� ������
import java.util.Scanner;

public class C1082 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char a = sc.next().charAt(0);
    int b = (int) a - 55; // 16������ ��ȯ

    for (int i = 1; i < 16; i++) {
      int c = i * b;
      System.out.println(
          String.format("%X", b) + "*" + String.format("%X", i) + "=" + String.format("%X", c));
      // %X> 16���� �빮�ڷ� ���
    }



  }
}

