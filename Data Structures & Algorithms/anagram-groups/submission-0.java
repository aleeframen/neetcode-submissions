class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for (String stn : strs) {
            int[] count = new int[26];
            for (char thisChar: stn.toCharArray()) {
                count[thisChar - 'a']++;
            }
            String key = Arrays.toString(count);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(stn);
        }

        return new ArrayList<>(groups.values());
    }
}
