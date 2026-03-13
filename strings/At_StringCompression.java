package strings;

public class At_StringCompression {
    public static void main(String[] args) {
        String str = "aaabbssccaabcd";
        StringBuilder strResult = new StringBuilder();
        int i = 0;
        int j = 1;

        while (j < str.length()) {
            if (str.charAt(j - 1) == str.charAt(j)) {
                j++;
            } else {
                strResult.append(str.charAt(i));
                strResult.append(String.valueOf(j - i));
                i = j;
                j++;
            }
        }
        // Handle last group
        strResult.append(str.charAt(i));
        strResult.append(String.valueOf(str.length() - i));

        System.out.println(strResult.toString());
    }
}
