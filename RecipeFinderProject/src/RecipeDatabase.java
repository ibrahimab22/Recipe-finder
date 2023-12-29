import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeDatabase {
    private List<Recipe> recipes; // Stores the list of recipes

    public RecipeDatabase() {
        recipes = new ArrayList<>(); // Initializing the list of recipes
        // Sample recipes
        recipes.add(new Recipe("Spaghetti Bolognese", Arrays.asList("pasta", "tomato sauce", "ground beef")));
        recipes.add(new Recipe("Vegetable Stir Fry", Arrays.asList("broccoli", "carrot", "bell pepper", "soy sauce")));
        recipes.add(new Recipe("Chicken Salad", Arrays.asList("chicken", "lettuce", "tomato", "cucumber")));
        recipes.add(new Recipe("Mushroom Risotto", Arrays.asList("rice", "mushroom", "chicken broth", "parmesan")));
        recipes.add(new Recipe("Tomato Soup", Arrays.asList("tomato", "onion", "carrot", "basil", "chicken broth")));
        recipes.add(new Recipe("Beef Tacos", Arrays.asList("ground beef", "taco shells", "cheese", "lettuce", "tomato")));
        recipes.add(new Recipe("Margherita Pizza", Arrays.asList("pizza dough", "tomato sauce", "mozzarella", "basil")));
        recipes.add(new Recipe("Peanut Butter Sandwich", Arrays.asList("bread", "peanut butter", "jelly")));
        recipes.add(new Recipe("Vegetable Curry", Arrays.asList("potato", "carrot", "coconut milk", "curry powder")));
        recipes.add(new Recipe("Cheese Omelette", Arrays.asList("egg", "cheese", "milk", "butter")));
        recipes.add(new Recipe("Baked Salmon", Arrays.asList("salmon", "lemon", "dill", "garlic")));
        recipes.add(new Recipe("Chocolate Cake", Arrays.asList("flour", "cocoa powder", "egg", "sugar", "butter")));
        recipes.add(new Recipe("Caesar Salad", Arrays.asList("lettuce", "croutons", "parmesan", "caesar dressing")));
        recipes.add(new Recipe("Grilled Cheese Sandwich", Arrays.asList("bread", "cheese", "butter")));
        recipes.add(new Recipe("Lentil Soup", Arrays.asList("lentils", "onion", "carrot", "celery", "tomato")));
        recipes.add(new Recipe("Caprese Salad", Arrays.asList("tomato", "mozzarella", "basil", "olive oil", "balsamic vinegar")));
        recipes.add(new Recipe("Pumpkin Soup", Arrays.asList("pumpkin", "onion", "garlic", "vegetable broth", "cream")));
        recipes.add(new Recipe("Fish Tacos", Arrays.asList("salmon", "taco shells", "cabbage", "avocado", "sour cream")));
        recipes.add(new Recipe("Pasta Carbonara", Arrays.asList("pasta", "egg", "bacon", "parmesan", "black pepper")));
        recipes.add(new Recipe("Stir-Fried Tofu", Arrays.asList("tofu", "soy sauce,", "bell pepper", "broccoli", "garlic", "ginger")));
    }
//
    public List<Recipe> getRecipes() {
        return recipes;
    }
}
