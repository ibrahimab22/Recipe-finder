import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RecipeFinder {
    
	private RecipeDatabase database;

    public RecipeFinder(RecipeDatabase database) {
        this.database = database;
    }
   // Method to find and display recipes based on user ingredients
    public void findRecipes(List<String> userIngredients) {
    	 List<Recipe> matchingRecipes = new ArrayList<>();
    	// Loop through each recipe in the database
         for (Recipe recipe : database.getRecipes()) {
             // Check each ingredient in the recipe
             for (String ingredient : recipe.getIngredients()) {
                 // If user ingredient list contains the recipe ingredient
                 if (userIngredients.contains(ingredient)) {
                     matchingRecipes.add(recipe); // Add recipe to matching list
    	                break; 
    	            }
    	        }
    	    }
      // If no matching recipes are found
        if (matchingRecipes.isEmpty()) {
            System.out.println("No matching recipes found.");
            return;
        }
        // Displaying the list of matching recipes

        System.out.println("Here are some foods that contain that 1 or more ingredients based on what you inputted:");
        for (int i = 0; i < matchingRecipes.size(); i++) {
            System.out.println((i + 1) + ": " + matchingRecipes.get(i).getName());
        }
        
        // If there's only one matching recipe, display its ingredients only

        if (matchingRecipes.size() == 1) {
            displayRecipeIngredients(matchingRecipes.get(0));
        } else {
            // If multiple recipes match, let the user select one to see the ingredients
            selectAndDisplayRecipe(matchingRecipes);
        }
    }
    
    // Method for user to select a recipe and display its ingredients
    private void selectAndDisplayRecipe(List<Recipe> recipes) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        // Loop to ensure valid selection
        while (choice < 1 || choice > recipes.size()) {
            System.out.println("Enter the number of the food to see the ingredients (or 0 to exit):");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 0) { // Option to exit
                    System.out.println("Exiting selection.");
                    return;
                } else if (choice > 0 && choice <= recipes.size()) {
                    displayRecipeIngredients(recipes.get(choice - 1));
                } else {
                    System.out.println("Invalid selection. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input
            }
        }
    }
 // Method to display the ingredients of a recipe
    private void displayRecipeIngredients(Recipe recipe) {
        System.out.println("Ingredients for " + recipe.getName() + ":");
        recipe.getIngredients().forEach(ingredient -> System.out.println("- " + ingredient));
    }
}
