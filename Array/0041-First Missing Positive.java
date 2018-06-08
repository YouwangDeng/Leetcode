//Solution 1 just cosider every case
class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        Arrays.sort(nums);
        int lo = 0;
        while(nums[lo] <= 0 && lo < nums.length - 1) lo++;
        if (nums[lo] <= 0 || nums[lo] > 1) {
                return 1;
            }
        for (int i = lo; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i] + 1) {
                return nums[i] + 1;
            }  
        }
        return nums[nums.length - 1] + 1;
    }
}
//Solution 2 two genius operations
class Solution {
    public int firstMissingPositive(int[] A) {
        int n=A.length;
        if(n==0)
            return 1;
        int k=partition(A)+1;
        int temp=0;
        int first_missing_Index=k;
        //Most genius part
        for(int i=0;i<k;i++){
            temp=Math.abs(A[i]);
            if(temp<=k)
                A[temp-1]=(A[temp-1]<0)?A[temp-1]:-A[temp-1];
        }

        for(int i=0;i<k;i++){
            if(A[i]>0){
                first_missing_Index=i;
                break;
            }
        }
        return first_missing_Index+1;
    }

    public int partition(int[] A){
        int n=A.length;
        int q=-1;
        for(int i=0;i<n;i++){
            if(A[i]>0){
                q++;
                swap(A,q,i);
            }
        }
        return q;
    }
    //XOR swap
    public void swap(int[] A, int i, int j){
        if(i!=j){
            A[i]^=A[j];
            A[j]^=A[i];
            A[i]^=A[j];
        }
    }
}