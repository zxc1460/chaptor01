package chaptor01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		int result = 1;
		System.out.print("입력: ");

		int pow = scanner.nextInt();
		
		for( int i = 0; i < pow; i++ ){
			result = result * 2;
		}
		
		
		System.out.println("2의 " + pow + "승은 " + result + " 입니다.");
		
		scanner.close();
		
	}

}
