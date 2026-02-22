//Program to create method that returns array.
class program35 {
    static int[] getSquares(int n) {
        int[] s = new int[n];
        for(int i=0;i<n;i++)
            s[i] = (i+1)*(i+1);
        return s;
    }
    public static void main(String[] args) {
        int[] res = getSquares(5);

        System.out.println("Squares returned from method:");
        for(int x=0; x<5; x++)
            System.out.print(res[x] + " ");
    }
}
