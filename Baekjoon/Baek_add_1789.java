//문제
//서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
//
//입력
//첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
package BaekJoon;

import java.util.Scanner;

public class Baek_add_1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong(); //자연수 S입력
		
		long sum =0;
		
		int i =0;
		
		while(sum<S)
		{
			i++;
			sum +=i;	
		}
		System.out.println(i-1);
	}

}
