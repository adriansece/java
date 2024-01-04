public class MatrixOperations{
    public static double[][] matrixAdd(double m1[][], double m2[][]){
        double[][] m3 = new double[3][3];
        for(int i=0 ; i<3 ; i++)
            for(int j=0;j<3;j++)
                m3[i][j] = m1[i][j] + m2[i][j];       
        return m3;
        //for(int i=0 ; i<3 ; i++)
          //  for(int j=0 ; j<3 ; j++)
            //    return m3[i][j];

        
    }

    public static double matrixDiagSum(double m1[][]){
        double s=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(i==j)
                    s=s+m1[i][j];
        return s;
    }
    public static void main(String[] args){
    

    }
}