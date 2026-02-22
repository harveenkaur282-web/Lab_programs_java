//Program to multiply two 2-D arrays
class program33 {
    public static void main(String[] args) {
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {5, 6}, {7, 8} };
        int[][] C = new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                C[i][j] = 0;
                for(int k=0;k<2;k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
