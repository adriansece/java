package hw7;
class Portfolio{
    private Share[] shares = new Share[100];
    private int noShares;

    
    public Portfolio(){
        this.noShares=0;
    }

    public void addShare(Share newShare){
        
        this.shares[noShares]=newShare;
        this.noShares++;
    }

    public double computeSum(){
        double sum=0;
        for(int i=1;i<=noShares;i++){
            sum = sum + this.shares[i].value;
        }
        return sum;
    }
}