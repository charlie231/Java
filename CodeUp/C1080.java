package Codeup;

// �Էµ� ������ ���ų� Ŭ������ 1���� 1�� ���� ���� ���
import java.util.Scanner;

public class C1080 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt(); // �Էµ� ��
    int b = 0;
    int sum = 0;


    while (true) {
      sum += b;
      b++;

      if (sum >= a) {
        System.out.println(b - 1);
        break;
      }
    }



  }
}

