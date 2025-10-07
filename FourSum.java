import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                int left = j+1, right = n-1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++; right--;
                    } else if(sum < target){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        for(List<Integer> quad : result){
            System.out.println(quad);
        }
    }
}
