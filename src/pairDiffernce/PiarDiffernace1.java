package pairDiffernce;

public class PiarDiffernace1 {
	static void pairDif(int arr[], int n) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(n==arr[j]-arr[i]) {
					System.out.println(arr[i]+ ","+arr[j]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = {1, 8, 30, 40, 100};
        int n = 60;
        pairDif(arr, n);
	}

}
