package chaptor01;

public class VariableTest {
	int number;
	
	public void test() {
		int j = number + 10;
	}
	public static void main(String[] args) {
		// int i = 20;
		
		int i;
		// int j = i;
		
		boolean isHoliday = false;
		char c = 'A';
		char c1 = 65;
		byte b = 10;
		short s = 20;
		int k = 10;
		long l = 123456789;
		float f = 3.14f;
		double d = 3.14;
		
		System.out.println( isHoliday );
		System.out.println( c + ":" + c1);
		System.out.println( b );
		System.out.println( s );
		System.out.println( k );
		System.out.println( l );
		System.out.println( f );
		System.out.println( d );

		final int MAX_SPPED = 20;
		
	
		
		String str = new String( "Hello" );
		System.out.println( str );

		String str1 = "Hello";
		System.out.println( str1 );
		
	}
}
