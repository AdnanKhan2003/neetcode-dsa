import java.util.Arrays;
import java.util.HashSet;

public class _1_contains_duplicate {
    // 1. Brute Force:
    // TC: O(n^2)
    // SC: O(1)
    public boolean hasDuplicateBF(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // 2. Sort
    // TC: O(n log n)
    // SC: O(n) or O(1)
    public boolean hasDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }

        return false;
    }

    // TC: O(n)
    // SC: O(n)
    // 3. Set
    public boolean hasDuplicateSet(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(st.contains(nums[i])) {
                return true;
            }
            st.add(nums[i]);
        }

        return false;
    }

    // 4. Set Length
    // TC: O(n)
    // SC: O(n)
    public boolean hasDuplicateSetLength(int[] nums) {
        return Arrays.stream(nums).distinct().count() == nums.length;
    }
}