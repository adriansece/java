package exam;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class exam{

    public static void main(String[] args) throws IOException{
        int buget = 3500;
        Scanner sc2 = null;
        String s = new String();
        List<String> citiesAndCosts = new ArrayList<String>();
    try {
        sc2 = new Scanner(new File("travel.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();  
    }
    while (sc2.hasNextLine()) {
        Scanner s2 = new Scanner(sc2.nextLine());
        while (s2.hasNext()) {
            citiesAndCosts.add(s2.next());
        }
    }

    
    for(int i=0;i<citiesAndCosts.size()-1;i+=2){
        System.out.println(citiesAndCosts.get(i));
    }
    int bMin = 3500;
    int nIt = -5;
    int pozI = 0;
    int poz = 0;
    List<String> destiantionsToPrint = new ArrayList<String>();
    List<String> mostExpensiveTrip = new ArrayList<String>();
    BufferedWriter writer = new BufferedWriter(new FileWriter ("out.txt", true));  
     

    for(int i=0; i< citiesAndCosts.size() / 2; i++){
        buget = 3500;
        poz = pozI;
        System.out.println("\nIteratia" + (pozI +1) + " ");
        while(true){
            if( (buget - Integer.parseInt(citiesAndCosts.get(poz % ((citiesAndCosts.size()/2)) *2 +1)) > 0))
                if( !destiantionsToPrint.contains(citiesAndCosts.get(poz % ((citiesAndCosts.size()/2)) *2)) ) 
                    {
                        destiantionsToPrint.add(citiesAndCosts.get(poz % ((citiesAndCosts.size()/2)) *2));
                        buget = buget - Integer.parseInt(citiesAndCosts.get(poz % ((citiesAndCosts.size()/2)) *2 +1));
                        poz++;
                    }
                else 
                    break; 
            else 
                break;
        }

        if(buget<bMin){
            bMin=buget;
            nIt=pozI;
            mostExpensiveTrip.removeAll(mostExpensiveTrip);
            mostExpensiveTrip.addAll(destiantionsToPrint);
        }

        for (String it : destiantionsToPrint)
            System.out.println(it);
        //PRINT IN FILE !!! 
        writer.append("Varianta " + (pozI+1));
        writer.append(destiantionsToPrint.toString() + "\n");
        pozI++;
        destiantionsToPrint.removeAll(destiantionsToPrint);

    }
    System.out.println(bMin);    
    writer.append("Cea mai scumpa excursie este: " + (nIt+1) + " " + mostExpensiveTrip);
    writer.close();
}

}