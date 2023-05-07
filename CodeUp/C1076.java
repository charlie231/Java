package Codeup;

// 입력받은 소문자까지 a부터 출력
import java.util.Scanner;

public class C1076 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char a = sc.next().charAt(0);

    for (int i = 97; i <= (int) a; i++) {
      char b = (char) i;
      System.out.print(b + " ");
    }



  }
}

