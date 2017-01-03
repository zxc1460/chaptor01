package chaptor01;

public class VariableTest {
	int number;
	
	public void test() {
		int j = number + 10; // 인스턴스 변수는 초기화가 된다.
	}
	public static void main(String[] args) {
		// int i = 20; // 에러 변수는 식별자다.
		
		int i;
		// int j = i; // 에러 지역변수는 반드시 초기화 되어야 한다.
		
		boolean isHoliday = false;
		char c = 'A'; // 문자 리터럴
		char c1 = 65; // 값 (아스키 코드)
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

		// 상수
		final int MAX_SPPED = 20;
		
		// MAX_SPEED = 200;
		//애러: final이 붙은 상수는 이후에 값 대입을 할 수 없다.
		
		// String 객체 확인
		
		String str = new String( "Hello" );
		System.out.println( str );

		// String 객체를 리터럴로 사용하기
		
		String str1 = "Hello";
		System.out.println( str1 );
		
	}
}
