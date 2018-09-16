public class Solution1SmallestPositiveInteger {

    public int solution(int[] A) {
        int result = 0;
        int headCnt = 0;
        int tailCnt = 0;

        for (int i : A){
            if(i == 0) {
                headCnt += 1;
            }else if(i == 1) {
                tailCnt += 1;
            }
        }

        if(headCnt > tailCnt){
            result = tailCnt;
        } else if (headCnt <= tailCnt) {
            result = headCnt;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 7, 9, 1, 2};

        int result = new Solution1SmallestPositiveInteger().solution(ar);
        System.out.println(result);

    }
}
