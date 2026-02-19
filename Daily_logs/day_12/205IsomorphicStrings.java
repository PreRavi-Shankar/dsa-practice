class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int id1 = 0;
        int id2 = 0;

        int[] arr1 = new int[s.length()];
        int[] arr2 = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (!map1.containsKey(c1)) {
                map1.put(c1, id1++);
            }

            if (!map2.containsKey(c2)) {
                map2.put(c2, id2++);
            } 

            arr1[i] = map1.get(c1);
            arr2[i] = map2.get(c2);
        }
        return Arrays.equals(arr1, arr2);
    }
}