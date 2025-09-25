class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
    String prefix = strs[0];
    for (String s : strs) while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length() - 1);
    return prefix;
    }
}