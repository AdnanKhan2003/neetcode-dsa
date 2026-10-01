public class Main {
    // 1. Contains Duplicate
    // public static void main(String[] args) {
    //     int[] arr = { 1, 2, 2, 4 };
    //     // int[] arr2 = { 1, 2, 3, 4 };
        
    //     // 1. BF:
    //     // _1_contains_duplicate checkdup = new _1_contains_duplicate();
    //     // boolean result = checkdup.hasDuplicateBF(arr);

    //     // 2. Sort:
    //     // _1_contains_duplicate checkdup = new _1_contains_duplicate();
    //     // boolean result = checkdup.hasDuplicateSort(arr);

    //     // 3. Set:
    //     // _1_contains_duplicate checkdup = new _1_contains_duplicate();
    //     // boolean result = checkdup.hasDuplicateSet(arr);

    //     // 4. Set Length:
    //     _1_contains_duplicate checkdup = new _1_contains_duplicate();
    //     boolean result = checkdup.hasDuplicateSetLength(arr);

    //     System.out.println(result);
    // }

    /////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "carrace";
        _2_is_anagram isAna =  new _2_is_anagram();

        // 1. Sort
        // boolean result = isAna.isAnagramSort(str1, str2);
        // System.out.println(result);

        // 2. Hash Map
        // boolean result = isAna.isAnagramHM(str1, str2);
        // System.out.println(result);

        // 3. Hash Table
        boolean result = isAna.isAnagramHT(str1, str2);
        System.out.println(result);
    }
    
    
    /////////////////////////////////////////////////////////////////////////////
    

}
