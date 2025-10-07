import java.util.*;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum == k) maxLen = i+1;
            if(!map.containsKey(sum)) map.put(sum, i);
            if(map.containsKey(sum - k)) maxLen = Math.max(maxLen, i - map.get(sum - k));
        }
        
        System.out.println(maxLen);
    }
}
