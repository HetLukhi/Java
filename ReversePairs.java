import java.util.*;

public class ReversePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        
        System.out.println(countReversePairs(nums, 0, n-1));
    }
    
    static int countReversePairs(int[] arr, int left, int right){
        int count = 0;
        if(left < right){
            int mid = (left + right)/2;
            count += countReversePairs(arr, left, mid);
            count += countReversePairs(arr, mid+1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }
    
    static int mergeAndCount(int[] arr, int left, int mid, int right){
        int count = 0;
        int j = mid + 1;
        for(int i=left; i<=mid; i++){
            while(j <= right && arr[i] > 2L * arr[j]) j++;
            count += (j - mid - 1);
        }
        
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        j = mid + 1;
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);
        
        return count;
    }
}
