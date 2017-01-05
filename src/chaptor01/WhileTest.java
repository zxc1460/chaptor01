package chaptor01;

import java.util.Scanner;

public class WhileTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		int sum = 0;
		
		while( true ){
			System.out.print( "입력[0 to quit]: ");
			int value = scanner.nextInt();
			
			if( value == 0 ){
				break;
			}
			
			sum += value;
		}
		
		System.out.println("Sum = " + sum);
	}

}
