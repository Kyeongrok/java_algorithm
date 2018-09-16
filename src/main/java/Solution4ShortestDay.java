import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Solution4ShortestDay {

    public int getSetCount(int[] A) {
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        HashSet<Integer> set = new HashSet<>(list);
        return set.size();
    }

    // 가장 짧은 모든 코스가 들어있는 날짜 수 세기
    public int solution(int[] A) {
        int init_num = getSetCount(A);
        int min = A.length;

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length; j++){
                if(i < j){
                    int[] range = Arrays.copyOfRange(A, i, j);
                    if(init_num == getSetCount(range)){
                        if(min > j - i)
                            min = j - i;
                    }
                }
            }

        }
        return min;
    }

    public static void main(String[] args) {
        Solution4ShortestDay solution4ShortestDay = new Solution4ShortestDay();
        int[] routeA = {2, 1, 1, 3, 2, 1, 1, 3};
        int[] routeB = {1, 3, 5};
        int[] routeC = {7, 5, 2, 7, 2, 7, 4, 7};
        System.out.println(solution4ShortestDay.solution(routeA));
        System.out.println(solution4ShortestDay.solution(routeB));
        System.out.println(solution4ShortestDay.solution(routeC));


    }
}
