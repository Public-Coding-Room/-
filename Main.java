package Main;

import java.util.Scanner;  

//25304번 영수증 풀이
public class Main {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

	int X = sc.nextInt();    	//총 금액
	int N = sc.nextInt();		//물건 종류의 수
	int total = 0;						// 가격*개수 = 총 금액
	
	for(int i =0; i<N; i++) {
		int a = sc.nextInt();		//물건 가격
		int b = sc.nextInt();		//물건 개수
		total += a*b;						// 가격*개수 = 총 금액 / 값을 계속 더해야하므로 += 사용
	}
	if(X == total) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	}
}  
//총금액
// 구매한 문건의 종류
//물건의 가격과 개수를 변수 N보다 적게 입력