class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int h = Arrays.stream(position).max().getAsInt();
        int ans = -1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(helper(position, m, mid)){
                ans = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }

    public boolean helper(int[] position, int m, int gap){
        int count = 1;
        int last = position[0];
        for(int i=1; i<position.length; i++){
            if(position[i] - last >= gap){
                count++;
                last = position[i];
            }
        }
        return count >= m;
    }
}