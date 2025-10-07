import java.util.*;

public class CountInversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        
        System.out.println(mergeSortAndCount(nums, 0, n-1));
    }
    
    static int mergeSortAndCount(int[] arr, int left, int right){
        int count = 0;
        if(left < right){
            int mid = (left + right)/2;
            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid+1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }
    
    static int mergeAndCount(int[] arr, int left, int mid, int right){
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);
        int i=0, j=0, k=left, swaps=0;
        
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps += (mid + 1) - (left + i);
            }
        }
        while(i < leftArr.length) arr[k++] = leftArr[i++];
        while(j < rightArr.length) arr[k++] = rightArr[j++];
        return swaps;
    }
}
