package Codeup;

import java.util.Scanner;

public class C1028 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    int b = Integer.parseUnsignedInt(a); // ussignedint�� ��ȯ
    String c = Integer.toUnsignedString(b); // ���� �׳�����ϸ� ������ �����߱⋚����
    // unsignedSTring���� �ѹ� �� ��ȯ

    System.out.println(c);

  }

}
