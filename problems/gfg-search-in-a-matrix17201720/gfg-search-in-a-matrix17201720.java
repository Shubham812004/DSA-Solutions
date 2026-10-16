class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int r = 0;
        int c = m-1;
        while(r < n && c >= 0){
            if(mat[r][c] == x){
                return true;
            }
            else if(mat[r][c] < x){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}