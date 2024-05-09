import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;

        for(int i = 0; i < length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

/*
나는 brute force 방식만 생각했는데 아무리 생각해도 이 방식은 O(N^2)라서 다른 해결책을 찾아야 한다는 데까지는 생각이 미쳤다.
그런데 아예 새로운 데이터 구조를 추가해서 조회에 사용할 수 있다는 건 생각을 못했다.
hash table은 조회 시 O(1)이므로 전체 time complexity는 O(N)가 되는 것이다.
조회를 요구하는 다른 문제에서도 hash table을 우선적으로 고려해봐야겠다.aa
*/