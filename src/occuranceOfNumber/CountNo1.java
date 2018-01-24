package occuranceOfNumber;

public class CountNo1 {
	static int occ(int[] arr, int n, int x) {
		int rest=0;
		for(int i=0;i<n;i++) {
			if(x==arr[i]) {
				rest++;
			}
		}
		return rest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
		int o=ar.length;
		int x=2;
		int re=occ(ar, o, x);
		System.out.println(re);

	}

}
