public class Addmatrix {
    
    public static void main(String[] args) {
        int m1[][] = { {1,2,4},{11,33,55},{20,3,0}};
        int m2[][] = { {0,2,9},{1,31,5},{29,36,1}};

        int summ[][] = new int[3][3];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m2.length;j++){
                summ[i][j]= m1[i][j]+m2[i][j];
                System.out.print(summ[i][j] +" ");
            }
            System.out.println();
        }
    }
}
