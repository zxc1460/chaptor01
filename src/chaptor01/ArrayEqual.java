package chaptor01;

public class ArrayEqual {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		int[] b = {10, 20, 30};
		
		boolean result = equals(a, b);
		System.out.println(result);
	}
	
	public static boolean equals(int[] arr1, int[] arr2){
		
		if(arr1 == null){
			return false;
		}
		
		if(arr2 == null){
			return false;
		}
		
		if(arr1.length != arr2.length){
			return false;
		}
		
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		
		return true;
	}

}
