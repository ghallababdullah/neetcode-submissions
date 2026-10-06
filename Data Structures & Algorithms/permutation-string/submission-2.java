class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];

        // 1. Fill the frequency array for s1, and the initial window for s2
        for (int i = 0; i < s1.length(); i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']++;
        }

        // 2. Check if the very first window is a match
        if (matches(s1Counts, s2Counts)) return true;

        // 3. Slide the window across s2
        for (int i = s1.length(); i < s2.length(); i++) {
            // Add the new character coming into the window
            s2Counts[s2.charAt(i) - 'a']++;
            // Remove the old character leaving the window
            s2Counts[s2.charAt(i - s1.length()) - 'a']--;

            // Check if the newly shifted window is a match
            if (matches(s1Counts, s2Counts)) return true;
        }

        return false;
    }

    // Helper method to compare the two frequency arrays
    private boolean matches(int[] s1Counts, int[] s2Counts) {
        for (int i = 0; i < 26; i++) {
            if (s1Counts[i] != s2Counts[i]) return false;
        }
        return true;
    }
}
