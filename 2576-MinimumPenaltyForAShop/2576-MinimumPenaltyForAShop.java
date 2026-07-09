// Last updated: 7/9/2026, 9:48:20 AM
 class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int penalty = 0, minPenalty = 0, bestHour = 0;

        for (int i = 0; i < n; i++) {
            // If customer comes and shop is closed later → penalty increases
            if (customers.charAt(i) == 'Y') {
                penalty -= 1; // better to stay open
            } else {
                penalty += 1; // 'N' → penalty if open
            }

            // Track minimum penalty
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }
        return bestHour;
    }
}
