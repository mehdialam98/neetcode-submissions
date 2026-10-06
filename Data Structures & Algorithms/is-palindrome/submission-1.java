class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder fixedString = new StringBuilder();

        for(char x : s.toCharArray()) {
            if(Character.isLetterOrDigit(x)) {
                fixedString.append(Character.toLowerCase(x));
            }
        }

        int leftPointer = 0;
        int rightPointer = fixedString.length()-1;

        while(leftPointer <= rightPointer) {
            if(fixedString.charAt(leftPointer) != fixedString.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}