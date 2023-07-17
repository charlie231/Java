package BaekJoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baek1026 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		
		int sum=0;
		
		for(int i =0; i<N;i++)
		{
			arr1[i]= sc.nextInt();		
		}
		
		for(int i =0; i<N;i++)
		{
			arr2[i]= sc.nextInt();			
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int j=0;j<N;j++)
		{
			sum+= arr1[j] *arr2[N-1-j];
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
