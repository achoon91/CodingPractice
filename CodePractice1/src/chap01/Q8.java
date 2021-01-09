package chap01;
import java.util.Scanner;
// 가우스의 덧셈을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램 작성

public class Q8 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("가우스덧셈을 이용해서 n까지의 합 구하기");
		System.out.println("n의 값은:");
		int n=stdIn.nextInt();
		
		int i=1; //초기값을 설정
		int sum=0;
		
		if(n%2==0)
		{
			sum=(i+n)*(n/2);
		}
		else
		{
			sum=(i+n)*((n+1)/2);
		}
		
		System.out.println("1부터 n까지의 총합은"+sum);
		
	}
	
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.println("1부터 n까지의 합을 구합니다.");
//		System.out.print("n의 값：");
//		int n = stdIn.nextInt();
//
//		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
//
//		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
//	}
}
