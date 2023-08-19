import java.util.Scanner;

public class if03{

	public static void main(String[] args){
		Scanner myScanner1 = new Scanner(System.in);
		System.out.println("请输入第一个数");
		double num1 = myScanner1.nextInt();

		Scanner myScanner2 = new Scanner(System.in);
		System.out.println("请输入第二个数");
		double num2 = myScanner2.nextInt();

		if(num1 > 10.0){
			if(num2 < 20.0){
				double sum = num1 + num2;
				System.out.print("两数之和为" + sum);
			}
			else{
				System.out.print("两个数不符合计算条件");
			}
		}
		else{
			System.out.print("两个数不符合计算条件");
		}
		System.out.print("程序继续执行……");
	}
}