package LC;

// 14. Longest Common Prefix

public class longestCommonPrefix {
    public String longCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        longestCommonPrefix s = new longestCommonPrefix();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(s.longCommonPrefix(strs));
    }
}