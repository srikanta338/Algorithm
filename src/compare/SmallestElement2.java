package compare;

public class SmallestElement2 {
	 static void small(int arr[]) {
		 int fLast;
		 int sLast;
		 if(arr[0]>arr[1]) {
			 fLast=arr[1];
			 sLast=arr[0];
		 }else {
			 fLast=arr[0];
			 sLast=arr[1];
		 }
		 
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<fLast) {
				sLast=fLast;
				fLast=arr[i];	
			}else if(arr[i]<sLast && arr[i]>fLast) {
				sLast=arr[i];
			}
			
			}
		System.out.println(fLast + " and "+ sLast);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {55,44,33,66,23,45,96};
		small(arr);

	}

}
 