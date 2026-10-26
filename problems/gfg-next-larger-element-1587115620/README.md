# Next Greater Element

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-next-larger-element-1587115620` |
| Topics | Stack |
| Solved | 2026-10-26 |
| Solve Time | 23m 29s |

## Solutions

```Java
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            res.add(-1);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
```
