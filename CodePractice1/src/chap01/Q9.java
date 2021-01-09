package chap01;
import java.util.Scanner;
// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 매서드를 작성

public class Q9 {
	static int sumof(int a,int b)
	{
		int sum=0;
		if(a<=b)
		{
			while(a<=b)
			{
				sum+=a;
				a++;
			}
		}
		else
		{
			while(b>=a)
			{
				sum+=b;
				b++;
			}
		}
		return sum;
	}
// 예시 답안	
//	static int sumof(int a, int b) {
//		int min; // a, b의 작은 쪽의 값
//		int max; // a, b의 큰 쪽의 값
//
//		if (a < b) {
//			min = a;
//			max = b;
//		} else {
//			min = b;
//			max = a;
//		}
//
//		int sum = 0; // 합
//		for (int i = min; i <= max; i++)
//			sum += i;
//		return (sum);
//	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("두 정수 사이의 모든 합");
		System.out.println("a의 값:");
		int a=stdIn.nextInt();
		System.out.println("b의 값:");
		int b=stdIn.nextInt();
		
		System.out.println("a와 b 정수 사의 합은:"+sumof(a, b));
	}
	
}
