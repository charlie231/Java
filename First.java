import java.util.Scanner;

public class First {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է�");
		String intInput = scanner.nextLine();
		try {
		int intValue = Integer.parseInt(intInput);
		System.out.println(intValue +1);
		} 
		catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ؾ� �մϴ�");
		}
				
		
	}
}
