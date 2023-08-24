package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Baek_game_2847 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i =0;i<N;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//StringTokenizer st = new StringTokenizer(arr);
		

		int count=0;
	
		
		for(int x = N-1; x >0;x--)
		{
			int y = x-1;
			
			if(arr[x]<=arr[y])
			{
				int more = arr[y];
				arr[y] = arr[x]-1;				
				count+= more-arr[y];				
			}
			else
			{
				continue;
			}
		}
		
		
		//bw.write(Arrays.toString(arr));
		bw.write(String.valueOf(count));		
		
		bw.flush();
		bw.close();
	}

}
