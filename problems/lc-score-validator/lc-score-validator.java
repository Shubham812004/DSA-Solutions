class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;
        for(int i=0; i<events.length; i++){
            if(counter == 10) break;
            
            if(events[i].equals("W")){
                counter++;
            }
            else if(events[i].equals("WD")){
                score += 1;
            }
            else if(events[i].equals("NB")){
                score += 1;
            }
            else{
                score += Integer.parseInt(events[i]);
            }
        }
        return new int[]{score, counter};
    }
}