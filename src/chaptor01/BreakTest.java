package chaptor01;

public class BreakTest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while( true ){
			sum = sum + num;
			if( sum > 5000){
				break;
			}
			
			num++;
		}
		
		System.out.println("Sum = " + sum);
	}

}
