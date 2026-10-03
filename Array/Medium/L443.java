

public class L443 {
    public static int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while (read < chars.length) {
            char current = chars[read];
            int count = 0;
            while (read < chars.length&&chars[read] == current) {
                count++;
                read++;
            }
            chars[write++] = current;
            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[write++] = c;
                }
            }

        }
        return write;
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'b', 'b', 'b', 'b', 'b' };
        System.out.println(compress(arr));
    }
}
