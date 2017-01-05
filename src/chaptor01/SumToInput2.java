package chaptor01;

public class SumToInput2 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("java SumToInput2 [number]");
			return;
		}
		
		
		// String -> int
		int num = Integer.parseInt(args[0]);
		
		// int -> String
		int n = 10;
		String s = "" + n;
		String s1 = String.valueOf(n);
		
		int sum = 0;
		for( int i = 0; i <= num; i++ ){
			sum += i;
		}
		
		System.out.println( "sum = " + sum );



	}

}
