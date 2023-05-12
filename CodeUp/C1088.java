package Codeup;

import java.util.*;

// 입력받은 수 까지의 합 출력
import java.util.Scanner;

public class C1088 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      if (i % 3 == 0) {
        continue;
      }
      System.out.print(i + " ");
    }



  }
}

