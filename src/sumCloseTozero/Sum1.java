package sumCloseTozero;

public class Sum1 {
	static void sum(int[] arr) {
		int summ=arr[0]+arr[1];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int summ1=arr[i]+arr[j];
				if(Math.abs(summ)>Math.abs(summ1)) {
					summ=summ1;
					
				}
				System.out.println(" The two elements whose "+
		                "sum is minimum are "+
		          arr[i]+ " and "+arr[j]);
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 60, -10, -70, 75, -80};
		sum(arr);

	}

}
