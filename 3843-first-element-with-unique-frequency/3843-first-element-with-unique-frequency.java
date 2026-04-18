import java.util.*;

class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> freqOccurrence = new HashMap<>();
        for (int count : freqMap.values()) {
            freqOccurrence.put(count, freqOccurrence.getOrDefault(count, 0) + 1);
        }
        
        for (int i = 0; i<nums.length;i++) {
            if (freqOccurrence.get(freqMap.get(nums[i])) == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}
