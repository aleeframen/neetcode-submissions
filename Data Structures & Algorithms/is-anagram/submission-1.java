class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap <Character, Integer> frequency = new HashMap<>();
        //populate s 
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            frequency.put(key, frequency.getOrDefault(key, 0) + 1);
        }

        //find t
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (!frequency.containsKey(key)) {
                return false;
            }
            else if (frequency.get(key) == 0) {
                return false;
            }
            else {
                frequency.put(key, frequency.getOrDefault(key, 0) - 1);
            }
        }
        return true;
    }
}
