
package exam;

import java.io.File;
import java.util.*;
public class BottleTest {
     public static void main(String[] args){
        ArrayList<String> bottle = new ArrayList<>();
        String currentLine;
        int noOfLines = 0;
        try{
            File file = new File("restaurant.txt");
            Scanner scan = new Scanner(file);
            Scanner inputScan = new Scanner(System.in);

            
            while(scan.hasNextLine()) {
                bottle.add(scan.nextLine());
                currentLine = bottle.get(noOfLines);
                currentLine = currentLine.replaceAll("\\s+", ",");
                bottle.set(noOfLines, currentLine);
                noOfLines++;
            }

            Bottle[] bottleArray = new Bottle[noOfLines];

            for(int i = 0; i < noOfLines; i++){
                String line = bottle.get(i);
                String[] parts = line.split(",");
                 bottleArray[i] = new Bottle(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));    
            } 
            
             double sum=0;
             for(int i = 0; i < noOfLines; i++){
                 sum=sum+ bottleArray[i].getPrice();
             }
             System.out.println("The restaurant earned" + sum);
}catch(Exception e){
            System.out.println("The file does not exist");
}
}
}
