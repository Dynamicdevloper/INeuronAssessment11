package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,7};
		System.out.println(missingK(arr, arr.length, 0));

	}
	
	public static int missingK(int[] vec, int n, int k) {
        // Write your code here.

        int low=0;
        int high= n-1;

        while(low<=high){
            int mid = low+high>>1;
            int missing= vec[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return k+high+1;
    }
}

