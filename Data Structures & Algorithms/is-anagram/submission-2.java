class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrOne = s.toCharArray();
        char[] arrTwo = t.toCharArray();
        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);
        if (Arrays.equals(arrOne, arrTwo)) {
            return true;
        }
        return false;
    }
}
