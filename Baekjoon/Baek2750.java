package Baek;

import java.util.Scanner;
import java.util.Arrays;

public class Baek2750 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int temp;
    int a = sc.nextInt();
    int[] arr = new int[a];
    for (int i = 0; i < a; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      System.out.println(arr[i]);
    }



  }


}
