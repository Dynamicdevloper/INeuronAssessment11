package in.ineuron;

public class Question1 {

	public static void main(String[] args) {
		
		System.out.println(sqrt(121));
	}
	
	public static int sqrt(int x) {
		
		if(x<=2) return x;
		int low=1;
		int high=x/2;
		while(low<=high) {
			int mid= low+high>>1;
			if(pow(mid)<=x) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return high;
	}

	private static int pow(int mid) {
		
		return mid*mid;
	}
}














