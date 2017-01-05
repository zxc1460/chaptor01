package chaptor01;

public class Continue01 {

	public static void main(String[] args) {
		int i = 0; 
		while ( i < 10 ) { 
		    if ( i > 5 ) {
		    	i++; // i가 증가하지 못하고 계속 무한루프 돌기 때문에 i를 여기서 한번 증가시킴
		       continue; 
		   } 
		   System.out.println( i ); 
		   i++; 
		} 


	}

}
