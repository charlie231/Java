package Codeup;

import java.util.Scanner;

public class C1028 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    int b = Integer.parseUnsignedInt(a); // ussignedint로 변환
    String c = Integer.toUnsignedString(b); // 윗글 그냥출력하면 음수로 오류뜨기떄문에
    // unsignedSTring으로 한번 더 변환

    System.out.println(c);

  }

}
