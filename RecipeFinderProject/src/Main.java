import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecipeDatabase database = new RecipeDatabase();
        RecipeFinder finder = new RecipeFinder(database);
        Scanner scanner = new Scanner(System.in);
     // Loop to continuously ask for user ingredients and find recipes
        while (true) {
            System.out.println("Enter one or more ingredients (comma separated):");
            String input = scanner.nextLine();

            List<String> userIngredients = Arrays.asList(input.split(",\\s*"));
            finder.findRecipes(userIngredients);
           
            // Ask the user if they are done

            System.out.println("Are you done? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();
            if ("yes".equals(response)) {
                break;
            }
        }
        scanner.close();
        System.out.println("Thank you for using the Recipe Finder!");
    }
}
