
public class L1910 {
    public static String removeOccurrences(String s, String part) {

        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            stack.append(s.charAt(i));
            if (stack.length() >= part.length()) {
                int start = stack.length() - part.length();
                if (stack.substring(start).equals(part)) {
                    stack.delete(start, stack.length());
                }

            }

        }
        return stack.toString();
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        String ans = removeOccurrences(s, part);
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i));
        }
    }
}
