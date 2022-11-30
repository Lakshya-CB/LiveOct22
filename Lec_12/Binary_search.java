package Lec_12;

public class Binary_search {
	public static void main(String[] args) {
		int[] Arr = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };
		System.out.println(found(Arr, 15));
		System.out.println(Integer.MAX_VALUE+ 100);
		System.out.println(2L+Integer.MAX_VALUE+ 100);
		
	}

	public static boolean found(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s<=e) {
			
			int mid = (s+e)/2;
//			System.out.println(arr[s]+" - "+arr[mid]+" - "+arr[e]);
			
			if(ali < arr[mid]) {
				e = mid-1;
			}else if(ali > arr[mid]) {
				s = mid+1;
			}else {
				return true;
			}
		}
		return false;
	}
	public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int ans = n;
        while(s<=e){
            // long mid_L = (1l+s+e)/2;
            // int mid = (int)mid_L;
            int mid = s + (e-s)/2;
            if(firstBadVersion(mid)){
                ans = mid;
                e = mid -1;
            }else{
                s = mid+1;
            }
        }
        
	    return ans;
	}
}
