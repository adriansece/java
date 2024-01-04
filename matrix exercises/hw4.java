public class hw4
{
    public static int[][] matrix1(int size)
    {
        int[][]newArr = new int[size][size];
        for(int i=0 ; i<size ; i++)
            for(int j=0 ; j<size ; j++)
                newArr[i][j] = 4*i + j + 1;
        return newArr;
    }

    public static int[][] matrix2(int size)
    {
        int[][]newArr = new int[size][size];
        for(int i=0 ; i<size ; i++)
            for(int j=0 ; j<size ; j++)
                newArr[i][j] = 4*j + i + 1;
        return newArr;
    }

    public static int[][] matrix3(int size)
    {
        int[][]newArr = new int[size][size];
        for(int i=0 ; i<size ; i=i+2)
            for(int j=0 ; j<size ; j++)
                newArr[i][j] = 4*i + j + 1;
        for(int i=1 ; i<size ; i=i+2)
            for(int j=(size-1) ; j>=0 ; j--)
                newArr[i][j] = i*4 + j + 1;
        return newArr;                
    }

    public static int[][] matrix4(int size)
    {
        int x=1;
        int[][]newArr = new int[size][size];
        int i=0;
        int j=0;
        while(j<size)
        {
            newArr[i][j] = x;
            x++;
            j++;
        }
        i++;
        while(j==(size-1) && i<=(size-1))
        {
            x++;
            newArr[i][j] = x;
            i++;
        }
        while(i==(size-1) && j==(size-2))
        {
            x++;
            newArr[i][j] = x;

        }
        return matrix4(4);
    }
}
