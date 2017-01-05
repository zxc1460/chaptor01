package chaptor01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("count: ");
		int count= scanner.nextInt();
		
		
		for( int i = 0; i < count; i++){
			System.out.println( "(" + i + ")" + " Hello World" );
		} 
		
		scanner.close();
		
	}

}
