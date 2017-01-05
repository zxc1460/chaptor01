package chaptor01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("count: ");
		int count= scanner.nextInt();
		
		
		int i = 1;
		while( i <= count){
			System.out.println( "(" + i + ")" + " Hello World" );
			i++;
			
		scanner.close();
		} 
		
	}

}
