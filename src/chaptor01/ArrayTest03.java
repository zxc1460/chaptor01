package chaptor01;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40};	
		int[] b = new int[] {10, 20, 30, 40};	
//		int[] a = new int[4];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
		
		
		int l = a.length;
		for(int i = 0; i < l; i++){
			System.out.println(a[i]);
		}
//		for(int i : a){
//			System.out.println(i);
//		}
		
		//	불가능
		//	int[] c;
	}

}
