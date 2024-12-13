package recipe_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import recipes.AfricanRecipe;
import recipes.SouthAmericanRecipe;
import recipes.WesternEuropeanRecipe;
import storagePack.RecipeReader;

public class RecipeConsole {

    private RecipeReader recipeReader = new RecipeReader();

    public RecipeConsole() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter your name:");
        String s1 = SC.next();
        System.out.println("Welcome: " + s1);

        // Call the validation function
        int s2 = getValidChoice(SC);

        Predicate<Recipe> isWesternEuropean = recipe -> recipe.getRegion() == Region.WESTERN_EUROPE;
        Predicate<Recipe> isAfrican = recipe -> recipe.getRegion() == Region.AFRICAN;
        Predicate<Recipe> isSouthAmerican = recipe -> recipe.getRegion() == Region.SOUTH_AMERICAN;

        ArrayList<Recipe> recipeList = recipeReader.getRecipeList();
        if (s2 == 1) {
            System.out.println("AfricanCuisine Selected");
            for (Recipe africa : recipeList) {
                if (isAfrican.test(africa)) {
                    if (africa instanceof AfricanRecipe) { // downcasting from parent to child
                        AfricanRecipe afroRecipe = (AfricanRecipe) africa;
                        // firewood would be used
                        Cooker potSize = afroRecipe;
                        System.out.println("Pot size needed for this Recipe is: " + potSize.fireWood(40.20)
                                + " inches in diameter");
                    }
                    breakDownRecipe(africa);
                    break;
                }
            }
        } else if (s2 == 2) {
            System.out.println("SouthAmericanCuisine Selected");
            System.out.println("");
            for (Recipe southamerica : recipeList) {
                if (isSouthAmerican.test(southamerica)) {
                    SouthAmericanRecipe weRecipe = (SouthAmericanRecipe) southamerica;
                    // electric would be used
                    Cooker potSize = weRecipe;
                    System.out.println(
                            "Pot size needed for this Recipe is: " + potSize.electric() + " inches in diameter");
                    breakDownRecipe(southamerica);
                    break;
                }
            }
        } else if (s2 == 3) {
            System.out.println("WesternEuropeanCuisine Selected");
            System.out.println("");
            for (Recipe westerneurope : recipeList) {
                if (isWesternEuropean.test(westerneurope)) {
                    WesternEuropeanRecipe weRecipe = (WesternEuropeanRecipe) westerneurope;
                    // electric would be used
                    Cooker potSize = weRecipe;
                    System.out.println(
                            "Pot size needed for this Recipe is: " + potSize.electric() + " inches in diameter");
                    breakDownRecipe(westerneurope);
                    break;
                }
            }
        }

        System.out.println("Thanks for using the app, See you again soon");
    }

    private int getValidChoice(Scanner SC) {
        int s2 = 0;
        boolean validInput = false;

        // Validate user input
        while (!validInput) {
            System.out.println(
                    "Enter 1 for AfricanCuisine, Enter 2 for SouthAmericanCuisine, Enter 3 for WesternEuropeanCuisine: ");
            if (SC.hasNextInt()) {
                s2 = SC.nextInt();
                if (s2 >= 1 && s2 <= 3) {
                    validInput = true; // Input is valid if it's 1, 2, or 3
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                SC.next(); // Clear invalid input
            }
        }
        return s2;
    }

    // Code reusability
    private void breakDownRecipe(Recipe africa) {
        System.out.println(africa);
        System.out.println();
        System.out.println("These are the Ingredients: ");
        int w = 0;
        for (Item Ingredients : africa.getIngredients().getMain()) {
            System.out.println((++w) + ". " + Ingredients.getItem());
        }
        System.out.println(" ");
        System.out.println("These are the instructions: ");
        System.out.println(" ");
        for (Instruction instructions : africa.getInstructions()) {
            System.out.println("-" + instructions.getStep());
            System.out.println(">>>" + instructions.getDescription());
            List<String> details = instructions.getDetails();

            for (String eachdetail : details) {
                System.out.println(eachdetail);
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        new RecipeConsole();
    }
}

