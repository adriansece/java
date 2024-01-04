public class hw4{
    public static boolean isPrime(int nr){
        int m, flag=0;
        m=nr/2;
        if(nr==0||nr==1){
            return false;
        }
        else{
            for(int i=2;i<=m;i++)
                if(nr%i==0){
                    return false;
                    flag=1;
                    break;
                }            
        }
        if(flag==0)
            return true;   
        return false; 
    }
    
}