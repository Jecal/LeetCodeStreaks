class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
        String conNumber = String.valueOf(number);
        int length = conNumber.length();
        if (length < 2) {
            return true;
        } else {
            int left = 0;
            int right = length - 1;
            while (left < right) {
                if ((conNumber.charAt(left) != conNumber.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}