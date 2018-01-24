package arrayRotation;

public class Demo {
	void rotationArray(int[] arr, int d, int n) {
		for(int i=0;i<d;i++) {
			leftRotation(arr, n);
		}
	}

	 void leftRotation(int[] arr, int n) {
		// TODO Auto-generated method stub
		 int i, temp;
		 temp=arr[0];
		 for( i=0;i<n-1;i++) {
			 arr[i]=arr[i+1];
			 
		 }
		 arr[i]=temp;
		
	}
	 void print(int[] arr, int size) {
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		int[] arr= {1,2,3,4,5,6,7};
		d.rotationArray(arr, 3, 7);
		d.print(arr, 7);
		

	}

}
