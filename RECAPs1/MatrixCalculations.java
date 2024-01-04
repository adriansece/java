public class MatrixCalculations{
    public static int sumMainDiagonal(int m[][]){
        int a[][] = new int[4][4];
        int n=4; //size
        int sdiag=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                if(i==j) 
                    sdiag = sdiag + a[i][j];
            }  
        return sdiag;
    }

    public static int sumUnderMainDiagonal(int m[][]){
        int b[][] = new int[4][4];
        int n=4;
        int sum=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(i>=j)
                    sum = sum + b[i][j];
        return sum;
    }
    public static void main(String[] args){

    }
}
