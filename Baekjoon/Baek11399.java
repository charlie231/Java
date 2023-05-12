package Baek;

// 선택정렬
import java.util.Scanner;
import java.util.Arrays;

public class Baek11399 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int temp = 0;


    int a = sc.nextInt();
    int[] arr = new int[a];
    int min;

    int[] arr2 = new int[a];
    int sum1 = 0;
    int sum2 = 0;
    int result = 0;


    for (int i = 0; i < a; i++) {
      arr[i] = sc.nextInt();
    }

    // 재배열(선택정렬)
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }



    // System.out.println(Arrays.toString(arr));

    // 덧셈
    for (int i = 0; i < a; i++) {
      sum1 = arr[i];
      sum2 += arr[i];
      arr2[i] = sum2;
      // System.out.println(sum1);
      // System.out.println(sum2);
    }

    for (int x : arr2) {
      result += x;

    }
    System.out.println(result);



  }
}
