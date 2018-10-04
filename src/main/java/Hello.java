public class Hello {

    public boolean solution(int[] A) {

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] > A[j]) {

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 3, 3, 7};
        boolean result = new Hello().solution(A);
        System.out.println(result);
    }
}
