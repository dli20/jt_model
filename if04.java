import java.util.Scanner;

public class if04{

	public static void main(String[] args){
		Scanner myScanner1 = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = myScanner1.nextInt();

		Scanner myScanner2 = new Scanner(System.in);
		System.out.println("请输入第二个数");
		int num2 = myScanner2.nextInt();

		int sum = num1 + num2;

		if(sum % 3 == 0 && sum % 5 == 0){
			System.out.print("程序继续执行……");
		}
		
	}
}