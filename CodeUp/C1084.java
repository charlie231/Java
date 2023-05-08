package Codeup;

// 경우의수까지 출력
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class C1084 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();


    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        for (int k = 0; k < c; k++) {
          String res = i + " " + j + " " + k + "\n";
          bw.write(res);
          bw.flush();
        }

      }
    }
    System.out.println(a * b * c);



  }
}

