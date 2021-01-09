package chap01;
import java.util.Scanner;
// n이 7일때 1+2+3+4+5+6+7=28로 출력하는 프로그램 작성

public class Q7 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1부터 n의 값까지 모두 더하는 식 출력하기");
		System.out.println("n의 값:");
		int n=stdIn.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(i<n)
			{
				System.out.print(i+"+");
			}
			else
			{
				System.out.print(i);
			}
			sum+=i;
		}
		System.out.println("="+sum);
		
	}
}
