package Codeup;

// 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
// 매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
//
// 예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
// 한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다. (최소공배수)

import java.util.Scanner;

public class C1092 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int day = 1;

    while (true) {

      if (day % a == 0 && day % b == 0 && day % c == 0) {
        System.out.println(day);
        break;
      }
      day++;
    }



  }
}

