class Solution {
	public int splitArray(int[] arr, int k) {
		// code here
		if (k > arr.length)
			return - 1;
		int l = Arrays.stream(arr).max().getAsInt();
		int h = 0;
		for (int num : arr) {
			h += num;
		}
		int ans = -1;
		while (l <= h) {
			int m = l + (h - l)/2;
			if (helper(arr, k, m)) {
				ans = m;
				h = m - 1;
			}
			else {
				l = m + 1;
			}
		}
		return ans;
	}
	
	public boolean helper(int[] arr, int k, int m){
         int count = 1;
         int sum = 0;
         for(int num : arr){
             if(sum + num <= m){
                 sum += num;
             }
             else{
                 count++;
                 sum = num;
             }
         }
         return count <= k;
     }
}
