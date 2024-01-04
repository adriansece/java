public class MatrixGenerators{
    public static int[][] matrix1(int size){
        int[][] mat = new int[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                mat[i][j]=i*size+j+1;
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                mat[i][j]=j*size+i+1;
        for(int i=0;i<size;i=i++)
            if(i%2==0)
                for(int j=0;j<size;j++)
                    mat[i][j]=i*size+j+1;
            else    
                for(int j=size;j>=0;j--)
                    mat[i][j]=i*size+size-j+1; 
                
                

            }
                

    }
}