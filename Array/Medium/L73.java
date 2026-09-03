public class L73 {
    public static int[][] setZeroes(int[][] matrix) {
        boolean fr=false;
        boolean fc=false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0]==0) {
                fc=true;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i]==0) {
                fr=true;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int k = 1; k < matrix[0].length; k++) {
                if(matrix[i][k]==0){
                    matrix[i][0]=0;
                    matrix[0][k]=0;
                }
            }
        }
        
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i]==0) {
                for (int k = 1; k < matrix.length; k++) {
                    matrix[k][i]=0;
                }
            }
        }

        

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0]==0) {
                for (int k = 1; k < matrix.length; k++) {
                    matrix[i][k]=0;
                }
            }
        }
        if (fc) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }
        if (fr) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int ans[][]=setZeroes(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }System.out.println();
        }
    }
}