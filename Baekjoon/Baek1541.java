package BaekJoon;

import java.util.Scanner;

public class Baek1541 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = Integer.MAX_VALUE;
		String[] subtraction = sc.nextLine().split("-");
		
		for(int i =0; i<subtraction.length;i++)
		{
			int temp = 0;
			
			String[] addition = subtraction[i].split("\\+");  
			//split시 +는 메타문자라 오류가 난다. 그래서 이스케이프 처리를 해야한다
			// \도 단독 출력 불가하기 때문에 \\를 붙인다.
			
			for(int j=0;j<addition.length;j++)
			{
				temp += Integer.parseInt(addition[j]);
			}
		
		
		if(sum == Integer.MAX_VALUE)
		{
			sum=temp;
		}
		else
		{
			sum -=temp;
		}
		}
		System.out.println(sum);
		
		
	}

}
