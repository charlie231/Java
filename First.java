import java.util.Scanner;

public class First {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 하나 입력");
		String intInput = scanner.nextLine();
		try {
		int intValue = Integer.parseInt(intInput);
		System.out.println(intValue +1);
		} 
		catch(NumberFormatException e) {
			System.out.println("숫자를 입력해야 합니다");
		}
				
		
	}
}
