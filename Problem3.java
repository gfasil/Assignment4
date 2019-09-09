package lesson4;

public class Problem3 {
public static int binarySearch(int a[],int n) {
	
	return binarySearch(a,n,a.length/2);
}
	private static int binarySearch(int[] a, int n, int i) {
		
	// TODO Auto-generated method stub
		if(a.length==0) return -1;
		 if(n==a[i]) return i;
		 if((i==0 ||i==a.length-1 )&& a[i]!=n) return -1;
		 else if(n>a[i]) {
			 
			 return binarySearch(a,n,(i+a.length)/2);
		 }
		 else {
			 return binarySearch(a,n,i/2);
				 
			 
		 }

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=binarySearch(new int[] {1,2,3,4,5},2);
		System.out.println(x);
	
		
	}

}
