class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Arrays.fill(res, 0);
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[i] = map.get(stack.peek()) - i;
            }
            stack.push(temperatures[i]);
            map.put(temperatures[i], i);
        }
        return res;
    }
}