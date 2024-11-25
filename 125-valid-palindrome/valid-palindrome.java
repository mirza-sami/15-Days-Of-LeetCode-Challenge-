class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
            String string = str.toString();
for (int k = 0,j = string.length()-1; k < string.length()/2; k++,j--) {
                if (string.charAt(k) != string.charAt(j) ) {
                    return false;
                }
            }
        
        
        return true;
    }
}