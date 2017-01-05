package chaptor01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		
		System.out.print("input: ");
		int num = scanner.nextInt();
		int sum = 0;
		
		for( int i = 0; i <= num; i++ ){
			sum += i;
		}
		
		System.out.println( "sum = " + sum );


	}

}
