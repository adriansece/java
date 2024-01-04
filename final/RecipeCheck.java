//fisierul:
//rosii 2
//patrunjel 3
//marar 3
//sare 1
import java.io.IOException;
import java.util.List;
class RecipeCheck{

    private static List<String> ReadRecipe(String string) {
            return null;
        }
    
    List<String> availableIngredients = ReadRecipe("ingredients.txt");

    public static boolean CheckRecipe (String path, List<String> ingredientsAvailable){
        List<String> requiredIngredients = ReadRecipe(path);
        System.out.println("Processing for recipe "+ path);

        for(int i=0;i<requiredIngredients.size()-1;i+=2)
        {   
            for(int j=0;i<ingredientsAvailable.size()-1;i+=2 )
            {
                System.out.println( "comp "+ (requiredIngredients.get(i % ((requiredIngredients.size()/2)) *2)) +" ---- "+ ingredientsAvailable.get(j % ((ingredientsAvailable.size()/2)) *2) );
                if(requiredIngredients.get(i % ((requiredIngredients.size()/2)) *2).contains(ingredientsAvailable.get(j % ((ingredientsAvailable.size()/2)) *2)) )
                {
                    System.out.println("Scadem " + (ingredientsAvailable.get(j % ((ingredientsAvailable.size()/2)) *2 +1)) + " - " + (requiredIngredients.get(i % ((requiredIngredients.size()/2)) *2 +1)) );
                    ingredientsAvailable.set( (j % ((ingredientsAvailable.size()/2)) *2 +1), String.valueOf(( Integer.parseInt(ingredientsAvailable.get(j % ((ingredientsAvailable.size()/2)) *2 +1)) 
                    - Integer.parseInt(requiredIngredients.get(i % ((requiredIngredients.size()/2)) *2 +1)) )) );
                }
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        
    List<String> availableIngredients = ReadRecipe("ingredients.txt");
    System.out.println("Available ingredients: " + availableIngredients);

    CheckRecipe("d", availableIngredients);
    System.out.println("Available ingredients: " + availableIngredients);

    for(String it: ReadRecipe(""))
        System.out.println(it);

    }
}