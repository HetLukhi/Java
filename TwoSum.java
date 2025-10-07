import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        int idx1 = -1, idx2 = -1;
        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                idx1 = map.get(complement);
                idx2 = i;
                break;
            }
            map.put(nums[i], i);
        }
        System.out.println("[" + idx1 + ", " + idx2 + "]");
    }
}
