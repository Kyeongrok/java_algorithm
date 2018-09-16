public class Solution2CharAt {

    public int solution(int A, int B) {
        return String.valueOf(B).indexOf(String.valueOf(A));
    }

    public static void main(String[] args) {
        Solution2CharAt solution2CharAt = new Solution2CharAt();

        System.out.println(solution2CharAt.solution(53, 1985324));
        System.out.println(solution2CharAt.solution(53, 1985424));


    }
}
