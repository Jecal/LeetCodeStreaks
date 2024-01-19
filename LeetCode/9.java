class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
        String conNumber = String.valueOf(number);
        int len = conNumber.length();
        if (len < 2) {
            return true;
        } else {
            int l = 0;
            int r = len - 1;
            while (l < r) {
                if ((conNumber.charAt(l) != conNumber.charAt(r))) {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
    }
}
