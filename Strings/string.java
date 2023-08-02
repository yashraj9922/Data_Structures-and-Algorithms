public class string {
    static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }
}
