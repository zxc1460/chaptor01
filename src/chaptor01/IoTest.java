package chaptor01;

import java.util.Scanner;

public class IoTest {

	public static void main(String[] args) {
//		System.out.println( "Hello World");
//		System.out.print("Hello World");
//		System.out.println("Hello World");
				
//		System.out.println();
//		System.out.print("\n");
//		System.out.println("Hello World");
		
		Scanner scanner = new Scanner( System.in );
		
		int count1 = scanner.nextInt();
		int count2 = scanner.nextInt();
		String str1 = scanner.next();
		
		System.out.println( count1 );
		System.out.println( count2 );
		System.out.println( str1 );
		
		String str2 = scanner.nextLine();
		System.out.println( str2 );
		
		scanner.close();
	}

}
