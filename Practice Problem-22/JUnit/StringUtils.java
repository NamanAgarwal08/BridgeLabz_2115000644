package JUnit;

public class StringUtils {
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public String toUpperCase(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            result += Character.toUpperCase(c);
        }
        return result;
    }
}
