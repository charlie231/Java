package Codeup;

// 3���� ������� �¶��� ä���ý��ۿ� ���� ������ Ǫ�� ��¥��
// �ſ� ��Ģ���̶�� �� ��, �ٽ� ��� �Բ� ������ Ǯ�� �Ǵ� �׳��� �����ϱ�?
//
// ���� ��� 3���� ���� �� ����/����ϰ�, ���� 3�ϸ���, 7�ϸ���, 9�ϸ���
// �� ���� ���´ٸ�, ó�� �����ϰ� 63�� ���� �ٽ� 3���� �Բ� ������ Ǯ�� �ȴ�. (�ּҰ����)

import java.util.Scanner;

public class C1092 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int day = 1;

    while (true) {

      if (day % a == 0 && day % b == 0 && day % c == 0) {
        System.out.println(day);
        break;
      }
      day++;
    }



  }
}

