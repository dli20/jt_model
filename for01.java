import java.util.Scanner;

public class for01{

	public static void main(String[] args){
		int num = 0;
		int sum = 0;
		for (int i=1; i<=100; i++){
			if (i % 9 == 0){
				num++;
				sum=sum+i;
				System.out.print(i + '\n');
			}
		}
		System.out.print(num);
		System.out.print(sum);
	}
}