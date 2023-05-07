package Codeup;

import java.util.Scanner;



public class C1027 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String[] time = sc.next().split("\\.");

    int year = Integer.parseInt(time[0]);
    int month = Integer.parseInt(time[1]);
    int day = Integer.parseInt(time[2]);



    System.out.print(String.format("%02d", day) + "-" + String.format("%02d", month) + "-"
        + String.format("%04d", year));



  }
}


