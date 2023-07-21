//문제
//어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
//
//미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.
//
//입력
//N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.
package BaekJoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_30_10610 {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 String N = sc.nextLine(); //N 입력
		 
		 int sum=0;
		 
		 char[] charArr = N.toCharArray();
		 Arrays.sort(charArr);
		 //Arrays.sort(charArr,Collections.reverseOrder()); //오름차순으로 정렬(object만 가능)
		 int len = charArr.length;
		 
		 StringBuilder sb = new StringBuilder();
		 
		 for(int i =len -1; i >=0;i--)
		 {
			 int num = charArr[i] - '0';
			 sum +=num;
			 sb.append(num);
		 }
		 
		 if(charArr[0] != '0' || sum %3!=0)
		 {
			 System.out.println(-1);
			 return;
		 }
		 System.out.println(sb.toString());
			 
	}

}
