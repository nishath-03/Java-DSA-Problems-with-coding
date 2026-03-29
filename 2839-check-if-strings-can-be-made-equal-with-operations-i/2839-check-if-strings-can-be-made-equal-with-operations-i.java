class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        // swap (0,2)
        if (swap(0, 2, s1).equals(s2)) return true;

        // swap (1,3)
        if (swap(1, 3, s1).equals(s2)) return true;

        // swap both (0,2) and (1,3)
        String temp = swap(0, 2, s1);
        temp = swap(1, 3, temp);
        if (temp.equals(s2)) return true;

        return false;
    }

    private String swap(int i, int j, String s) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
}