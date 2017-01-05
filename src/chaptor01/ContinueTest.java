package chaptor01;

public class ContinueTest {

	public static void main(String[] args) {
		for( int i = 0; i < 20; i++){
			
			if( i % 2 == 0 || i % 3 == 0 ){
				continue;
			}
			System.out.println( i );
		}
	}

}
