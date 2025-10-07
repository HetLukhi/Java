import java.util.*;

public class FindErrorNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        
        int duplicate = -1, missing = -1;
        boolean[] seen = new boolean[n+1];
        
        for(int num : nums){
            if(seen[num]) duplicate = num;
            seen[num] = true;
        }
        
        for(int i=1; i<=n; i++){
            if(!seen[i]) missing = i;
        }
        
        System.out.println("[" + duplicate + ", " + missing + "]");
    }
}
