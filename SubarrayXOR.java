import java.util.*;

public class SubarrayXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();
        
        Map<Integer, Integer> xorMap = new HashMap<>();
        int count = 0, xor = 0;
        
        for(int num : nums){
            xor ^= num;
            if(xor == k) count++;
            if(xorMap.containsKey(xor ^ k)) count += xorMap.get(xor ^ k);
            xorMap.put(xor, xorMap.getOrDefault(xor, 0) + 1);
        }
        
        System.out.println(count);
    }
}
