import java.util.Arrays;


public class Solution3Map {
    public boolean solution(int[] A) {
        int different = 0;

        int[] copyedArray = Arrays.copyOf(A, A.length);
        Arrays.sort(copyedArray);

        for (int i = 0; i < A.length ; i++) {
            if(A[i] != copyedArray[i])
                different += 1;
        }

        if (different == 0 || different == 2) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5};
        boolean result = new Solution3Map().solution(A);
        System.out.println(result);
    }
}
