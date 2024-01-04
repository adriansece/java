package hw7;
public class testPortfolio {
    public static void main(String[] args) {
        Portfolio p = new Portfolio();
        Company c1 = new Company("Ubisoft");
        Share s1 = new Share(1200, c1);
        Share s2 = new Share(500, c1);
        Share s3 = new Share(700, c1);
        Company c2 = new Company("Apple");
        Share s4 = new Share(800, c2);
        Share s5 = new Share(900, c2);
        Share s6 = new Share(100, c2);

        p.addShare(s1);
        p.addShare(s2);
        p.addShare(s3);
        p.addShare(s4);
        p.addShare(s5);
        p.addShare(s6);

        System.out.println(p.computeSum());
    }

}
class Company{
         String name;
         Company(String n){
            name=n;
            System.out.println("New comany CREATED: " + name);
        }
    }

class Share{
        double value;
        Company company;
    
        public Share(double v, Company c){
            value=v;
            company=c;
            System.out.println("New Share CREATED with: " + v + " " + c.name.toString());
        }
    }

class Portfolio{
        Share[] shares = new Share[100];
        int noShares = 0;

        
        public Portfolio(){
            System.out.println("New Portfolio is created with shares: "+ noShares);
        }

        public void addShare(Share newShare){
            
            shares[noShares]=newShare;
            System.out.println("New share added: NUMBER: "+noShares+" Value: " + shares[noShares].value + " " );
            noShares++;
            System.out.println("Number of shared is changed to: "+ noShares);
        }

        public double computeSum(){
            double sum=0;
            System.out.println("Computing SUM. No od shares: " + noShares);
            for(int i=0;i<noShares;i++){
                sum = sum + shares[i].value;
                System.out.println("--computing " + i + " . " + shares[i].value);
            }
            return sum;
        }
    }

