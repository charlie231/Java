package Codeup;

// 원하는 문자가 입력될 때까지 반복입력
import java.util.Scanner;

public class C1079 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    while (true) {
      char a = sc.next().charAt(0);
      if (a == 'q') {
        System.out.println(a);
        break;
      } else {
        System.out.println(a);
      }
    }


  }
}

