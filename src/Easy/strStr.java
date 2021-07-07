package Easy;

public class strStr {
    public int strStr1(String haystack, String needle) {
        if (haystack == "" || needle == "") return 0;

        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i <= len1 - len2; i++) {
            Boolean k = true;
            for (int j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    k = false;
                    break;
                }

            }
            if (k == true) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ll";
        strStr strStr = new strStr();
        int i = strStr.strStr1(str1,str2);
        System.out.println(i);
    }
}
