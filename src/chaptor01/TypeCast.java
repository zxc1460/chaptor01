package chaptor01;

public class TypeCast {

	public static void main(String[] args) {
		// 암시적 (inplicity) casting
		int i1 = 9999;
		long l1 = i1;
		
		// 명시적 (exlicity) casting
		long l2 = 923456789231L;
		int i2 = (int)l2;
		
		System.out.println( l1 + ":" + i1 );
		System.out.println( l2 + ":" + i2 );
	}

}
