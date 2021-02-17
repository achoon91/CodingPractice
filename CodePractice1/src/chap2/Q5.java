package chap2;
import java.util.Scanner;
//배열 b의 모든 요소를 배열 a에 역순으로 copy하는 메소드를 작성

public class Q5 {
	static void rcopy(int[] a,int[] b)
	{
		int num = a.length <=b.length?a.length:b.length;
		for(int i=0;i<num;i++)
		{
			a[i]=b[b.length-i-1];
		}
	}
	public static void main(String[] args) {
		Scanner stdId=new Scanner(System.in);
		
		System.out.println("a의 요솟수는 :");
		int numa = stdId.nextInt();
		int[] a=new int[numa];
		for(int i=0;i<numa;i++)
		{
			System.out.println("a["+i+"]:");
			a[i]=stdId.nextInt();
		}
		
		System.out.println("b의 요솟수는 :");
		int numb=stdId.nextInt();
		int[] b=new int[numb];
		for(int i=0;i<numb;i++)
		{
			System.out.println("b["+i+"]:");
			b[i] =stdId.nextInt();
		}
		rcopy(a,b); // 배열 b의 모든 요소를 배열 a에 역순으로 copy
		
		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사했습니다.");
		for(int i=0;i<numa;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
