import java.util.Arrays;
import java.util.HashMap;

public class _2_is_anagram {
    // 1. Sort
    // TC: O(n log n) + O(m log m)
    // SC: O(N + M)
    public boolean isAnagramSort(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();

        Arrays.sort(sortS);
        Arrays.sort(sortT);

        return Arrays.equals(sortS, sortT);
    }

    // 2. HashMap
    // TC: O(n + M)
    // SC: O(1)
    public  boolean isAnagramHM(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> hmS = new HashMap<>();
        HashMap<Character, Integer> hmT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            hmS.put(s.charAt(i), hmS.getOrDefault(s.charAt(i), 0) + 1);
            hmT.put(s.charAt(i), hmT.getOrDefault(s.charAt(i), 0) + 1);
        }

        return hmS.equals(hmT);
    }

    // 3. Hash Table
    // TC:  O(n + m)
    // SC:  O(m + n)
    public  boolean isAnagramHT(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--; 
        }

        for(int entry : arr) {
            if(entry != 0) return false;
        }
        return true;
    }
}
