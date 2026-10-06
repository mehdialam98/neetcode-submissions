class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] leftProduct = new int[N];
        int[] rightProduct = new int[N];
        int[] outputArray = new int[N];

        leftProduct[0] = 1;
        rightProduct[N-1] = 1;

        for(int i=1; i<N; i++) {
            leftProduct[i] = nums[i-1] * leftProduct[i-1];
        }

        for(int i=N-2; i>=0; i--) {
            rightProduct[i] = nums[i+1] * rightProduct[i+1];
        }

        for(int i=0; i<N; i++) {
            outputArray[i] = leftProduct[i] * rightProduct[i];
        }

        return outputArray;
    }
}