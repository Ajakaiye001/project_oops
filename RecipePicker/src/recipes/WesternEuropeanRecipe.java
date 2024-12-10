package recipes;

import java.util.List;

import recipe_app.Ingredients;
import recipe_app.Instruction;
import recipe_app.Recipe;

public class WesternEuropeanRecipe extends Recipe {
	private Ingredients ingredients;
	private List<Instruction> instructions;

	@Override
	protected Ingredients getIngredients() {
		// TODO Auto-generated method stub
		return ingredients;
	}

	@Override
	protected List<Instruction> getInstructions() {
		// TODO Auto-generated method stub
		return instructions;
	}

}
