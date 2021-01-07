package chap01;
// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.

import java.util.Scanner;

public class Max3m {
	//a,b,c의 최댓값을 구하여 반환합니다.
	
	static int max3(int a,int b, int c) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
	
//	public static void main(String[] args) {
//		System.out.println("max3(3,2,1)="+max3(3,2,1));
//		System.out.println("max3(3,2,2)="+max3(3,2,1));
//		System.out.println("max3(3,1,2)="+max3(3,2,1));
//	}
	
	
// 1번: 네 값의 최대값을 구하는 max4의 메서드를 작성하시오
	static int max4(int a,int b,int c,int d) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		return max;
}
//	public static void main(String[] args) {
//		Scanner stdln=new Scanner(System.in);
//		int a,b,c,d;
//		
//		System.out.println("네 정수의 최댓값을 구합니다.");
//		System.out.println("a의 값:");
//		a=stdln.nextInt();
//		System.out.println("b의 값:");
//		b=stdln.nextInt();
//		System.out.println("c의 값:");
//		c=stdln.nextInt();
//		System.out.println("d의 값:");
//		d=stdln.nextInt();
//		
//		int max=max4(a,b,c,d);
//		
//		System.out.println("최대값은"+max+"입니다");
//}
	
// 2번: 세 값의 최솟값을 구하는 메소드를 작성하세요
	static int min3(int a,int b,int c)
	{
		int min=a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		return min;
	}
	public static void main(String[] args) {
		Scanner stdln=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("세 정수의 최솟값을 구합니다.");
		System.out.println("a의 값:");
		a=stdln.nextInt();
		System.out.println("b의 값:");
		b=stdln.nextInt();
		System.out.println("c의 값: ");
		c=stdln.nextInt();
		
		int min=min3(a,b,c);
		System.out.println("최솟값은"+min+"입니다");
		
	}
}
