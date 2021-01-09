package chap01;
import java.util.Scanner;
// 1부터 n까지의 합

public class sum_for {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하시오");
		System.out.println("n의 값:");
		int n=stdIn.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		
		System.out.println("1부터 "+n+"까지의 합은"+sum+"이다");
	}
}
