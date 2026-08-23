class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return ans;
        }

        int[] phash = new int[26];
        int[] hash = new int[26];
        int len = s.length();
        int window = p.length();

        for (int i = 0; i < window; i++) {
            phash[p.charAt(i) - 'a']++;
            hash[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(phash, hash)) {
            ans.add(0);
        }

        for (int i = window; i < len; i++) {
            hash[s.charAt(i) - 'a']++;
            hash[s.charAt(i - window) - 'a']--;

            if (Arrays.equals(phash, hash)) {
                ans.add(i - window + 1);
            }
        }

        return ans;
    }
}