package chaptor01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력: ");

		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;

		while( divisor < num){
			if( (num % divisor) == 0){
				isPrime = false;
				break;
			}
			divisor++;
		}
		
		
		if (isPrime == true) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");

		}
		
		stdin.close();
	}

}
