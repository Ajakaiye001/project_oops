package storage_pack;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import recipe_app.Recipe;
import recipe_app.Region;
import recipes.AfricanRecipe;
import recipes.SouthAmericanRecipe;
import recipes.WesternEuropeanRecipe;

public class RecipeReader {
	
	private ArrayList<Recipe> recipeList = new ArrayList<>();
	
	 public RecipeReader(){
	        String jsonFilePath = "recipes.json";

	        Gson gson = new Gson();

	        try {
	            Type africanRecipeListType = new TypeToken<List<AfricanRecipe>>() {}.getType();
	            List<AfricanRecipe> africanRecipes = gson.fromJson(new FileReader(jsonFilePath), africanRecipeListType);

	            // Print African Recipes
	            for (AfricanRecipe recipe : africanRecipes) {
	            	//System.out.println(recipe.getRegion());
	            	if(recipe.getRegion() == Region.AFRICAN) recipeList.add(recipe);
	            }

	            
	            Type SARecipeListType = new TypeToken<List<SouthAmericanRecipe>>() {}.getType();
	            List<SouthAmericanRecipe> brazilianRecipes = gson.fromJson(new FileReader(jsonFilePath), SARecipeListType);

	            for (SouthAmericanRecipe recipe : brazilianRecipes) {
	            	if(recipe.getRegion() == Region.SOUTH_AMERICAN) recipeList.add(recipe);
	            }

	            // Load Irish Recipes
	            Type WERecipeListType = new TypeToken<List<WesternEuropeanRecipe>>() {}.getType();
	            List<WesternEuropeanRecipe> irishRecipes = gson.fromJson(new FileReader(jsonFilePath), WERecipeListType);

	            // Print Irish Recipes
	            for (WesternEuropeanRecipe recipe : irishRecipes) {
	            	if(recipe.getRegion() == Region.WESTERN_EUROPE) recipeList.add(recipe);
	            }
	            

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        
	        
	    }

		public ArrayList<Recipe> getRecipeList() {
			return recipeList;
		}

		public void setRecipeList(ArrayList<Recipe> recipeList) {
			this.recipeList = recipeList;
		}
	}



