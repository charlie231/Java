package BaekJoon;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Baek1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int start = 0;
		int end = 0;
		
		
		int[][] arr= new int[N][2];
		
		for(int i=0; i<N; i++)
		{			
			arr[i][0] = sc.nextInt();  //시작
			arr[i][1] = sc.nextInt();  //종료	
		}
		
		//System.out.println(Arrays.deepToString(arr));  //2차원배열은 deep
		
		//끝나는 시간을 기준으로 정렬하기 위해 compare재정의
		Arrays.sort(arr, new Comparator<int[]>() {  //내림차순 Comparator
			
			@Override
			public int compare(int[] o1, int[] o2) {  //좌측 값이 크면 1 우측값이 크면 -1
				//음수가 리턴되면 오른쪽 인자가 아래로 내려감
				
				//종료시간이 같을 경우 시작시간이 빠른순으로 정렬
				if(o1[1] ==o2[1]) {
					return o1[0] - o2[0];
				}
				System.out.print(Arrays.toString(o1));
				System.out.println(Arrays.toString(o2));
				
				return o1[1] - o2[1];
			}
			
			
			
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i =0; i<N;i++) {
			if(prev_end_time <= arr[i][0]) {  //전의 종료시간보다 지금 시작시간이 같거나 클때
				prev_end_time = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
