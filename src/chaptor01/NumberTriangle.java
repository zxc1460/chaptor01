package chaptor01;

public class NumberTriangle {

	public static void main(String[] args) {
		if(args.length == 0){
			return;
		}
		int num = Integer.parseInt(args[0]);
		
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
