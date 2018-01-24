package maxProductinArray;

public class Product {
	static void mult(int[] arr) {
		int mut1= arr[0] * arr [1];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int mut2=arr[i]*arr[j];
				if(mut2>mut1) {
					
					mut1=mut2;
					
					
				}
				System.out.println(arr[i]+" * "+ arr[j]+ " = " +mut2);
				
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 3, 6, 7, 0};
		mult(arr);

	}

}
