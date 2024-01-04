package text_files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class text2 {
    public static void main(String[] args) throws IOException{
        
        int min = 0;
        int max = 0;
        int sum = 0;
        int x=0;
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
            //System.out.println(reader.readLine());

            String[] splited = reader.readLine().split(" ");
            for(int i=0 ; i<=19 ; i++)
            {
                Integer nr = Integer.valueOf(splited[i]);
                sum = sum + nr;
                x++;
            }
            System.out.println("Sum of the numbers is: " + sum);
            System.out.println("Average of the numbers is: " + sum/x);

            for(int i=0 ; i<=19 ; i++)
            {
                Integer nr = Integer.valueOf(splited[i]);
                if(nr<min) min = nr;
                else if(nr>max) max = nr;
            }

            System.out.println("Max nr is: " + max);
            System.out.println("Min nr is: " + min);
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}


