class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(entry);
        }
        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> curr = pq.poll();
            int freq = curr.getValue();
            char ch = curr.getKey();
            while(freq > 0){
                str.append(ch);
                freq--;
            }
        }
        return str.toString();
    }
}