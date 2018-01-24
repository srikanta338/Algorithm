package maxProductinArray;

public class Product2 {
	static void mult(int [] arr) {
		int a=arr[0];
		int  b=arr[1];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]>a*b) {
					a=arr[i];
					b=arr[j];
				}
					
			
				
					
				}
			System.out.println(a+" * "+ b );
				
				
				
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 3, 6, 7, 0};
		mult(arr);

	}

}
