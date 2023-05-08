package Codeup;

// 16진수중 알파벳만 입력받아 해당 알파벳을 16까지 곱하는 16진수 구구단
import java.util.Scanner;

public class C1082 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char a = sc.next().charAt(0);
    int b = (int) a - 55; // 16진수로 변환

    for (int i = 1; i < 16; i++) {
      int c = i * b;
      System.out.println(
          String.format("%X", b) + "*" + String.format("%X", i) + "=" + String.format("%X", c));
      // %X> 16진수 대문자로 출력
    }



  }
}

