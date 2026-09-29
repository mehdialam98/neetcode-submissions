class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> numsCopy = new HashSet<>();

        for(int num : nums) {
            numsCopy.add(num);
        }

        for(int num : numsCopy) {
            if(!numsCopy.contains(num - 1)) {
                int streak = 0;
                int current = num;
                while(numsCopy.contains(current)) {
                    streak++;
                    current++;
                }
                result = Math.max(result, streak);
            }
        }
        return result;
    }
}