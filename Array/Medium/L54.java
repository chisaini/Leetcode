import java.util.ArrayList;
import java.util.List;

public class L54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int w = matrix[0].length - 1;
        int h = matrix.length - 1;
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < (matrix.length * matrix[0].length)) {

            for (int i = b; i <= w; i++) {
                list.add(matrix[a][i]);
                c++;
            }

            a++;
            for (int i = a; i <= h; i++) {
                list.add(matrix[i][w]);
                c++;
            }
            w--;
            if (a <= h) {
                for (int i = w; i >= b; i--) {
                    list.add(matrix[h][i]);
                    c++;
                }
                h--;
            }
            if (b <= w) {
                for (int i = h; i >= a; i--) {
                    list.add(matrix[i][b]);
                    c++;
                }
                b++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        spiralOrder(matrix);

    }
}
