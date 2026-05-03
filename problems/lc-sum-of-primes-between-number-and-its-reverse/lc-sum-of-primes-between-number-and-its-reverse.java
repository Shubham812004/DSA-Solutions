class Solution {
    public int reverseNumber(int n){
        int revNum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n/10;
        }
        return revNum;
    }

    public boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num % i==0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int sum = 0;
        int r = reverseNumber(n);
        int start = Math.min(n,r);
        int end = Math.max(n,r);
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
}