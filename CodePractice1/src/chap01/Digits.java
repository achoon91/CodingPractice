package chap01;
import java.util.Scanner;
// 2자리 양수 값 입력

public class Digits {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int no;
		
		System.out.println("두 자리 정수 입력:");
		
		do {
			System.out.println("no의 값:");
			no=stdIn.nextInt();
		}while(no<10 || no >99);
		
		System.out.println("no의 값은"+no+"입니다.");
	}
}
