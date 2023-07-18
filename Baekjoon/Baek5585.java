package BaekJoon;

import java.util.Scanner;

public class Baek5585 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //물건값
		
		int sum = 1000-N;  //거스름돈
		
		int[] arr= {500,100,50,10,5,1};  //거스름돈 종류
		
		int count = 0; //거스름돈 개수
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(arr[i]*j>sum)
				{
					count += (j-1);
					sum -=arr[i]*(j-1);
					break;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.println(count);
		
		
	}

}
