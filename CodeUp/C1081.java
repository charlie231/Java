package Codeup;

// �Է¹��� ���ڱ��� �ֻ��� ����Ǽ� ���
import java.util.Scanner;

public class C1081 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 1; i < 11; i++) {
      if (a < i) {
        break;
      } else {

      }
      for (int j = 1; j < 11; j++) {
        if (b < j) {
          break;
        } else {
          System.out.println(i + " " + j);
        }



      }
    }


  }
}

