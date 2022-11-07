class Solution {
    public int maximum69Number (int num) {
        // String str= num.toString();
        int numChanged = num;
        int indexSix = -1;
        int currentDigit = 0;
        while(numChanged>0) {
            if(numChanged%10==6) {
                indexSix = currentDigit;
            }
            numChanged = numChanged/10;
            currentDigit++;
        }
        return indexSix == -1 ? num : num + 3*(int)Math.pow(10, indexSix);
    }
}