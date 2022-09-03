// class Solution {
//     List<Integer> list = new ArrayList();
//     public int[] numsSameConsecDiff(int n, int k) {
//          calculateDiff(i, lastInt, k);
//     }
//     public void calculateDiff(int n, int lastInt, int lastValue, int k) {
//         if((int) (Math.log10(lastValue) + 1) == i) {
//             list.add(lastValue);
//             return;
//         }
//         for(int i=0;i<10;i++) {
//             if(lastInt - i == k) {
//                 lastInt = i;
//                 calculateDiff(n, lastInt, lastValue*10+i,k);
//             }
//         }
//     }
// }
class Solution {

    public int[] numsSameConsecDiff(int N, int K) {
        if (N == 1)
            return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> results = new ArrayList<Integer>();
        for (int num = 1; num < 10; ++num)
            this.DFS(N - 1, num, K, results);

        // convert the ArrayList to int[]
        return results.stream().mapToInt(i->i).toArray();
    }

    protected void DFS(int N, int num, int K, List<Integer> results) {
        if (N == 0) {
            results.add(num);
            return;
        }
        List<Integer> nextDigits = new ArrayList<>();

        Integer tailDigit = num % 10;
        nextDigits.add(tailDigit + K);
        if (K != 0)
            nextDigits.add(tailDigit - K);
        for (Integer nextDigit : nextDigits) {
            if (0 <= nextDigit && nextDigit < 10) {
                Integer newNum = num * 10 + nextDigit;
                this.DFS(N - 1, newNum, K, results);
            }
        }
    }
}