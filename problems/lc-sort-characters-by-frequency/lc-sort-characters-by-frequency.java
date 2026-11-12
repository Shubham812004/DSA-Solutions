class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> curr = pq.poll();
            char ch = curr.getKey();
            int freq = curr.getValue();
            while(freq > 0){
                str.append(ch);
                freq--;
            }
        }
        return str.toString();
    }
}