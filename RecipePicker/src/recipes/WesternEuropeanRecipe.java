package recipes;



import java.util.List;

import recipe_app.Cooker;
import recipe_app.Ingredients;
import recipe_app.Instruction;
import recipe_app.Recipe;

public class WesternEuropeanRecipe extends Recipe implements Cooker{
    private Ingredients ingredients;
    private List<Instruction> instructions;

    @Override
    public Ingredients getIngredients() {
        return ingredients;
    }

    @Override
    public List<Instruction> getInstructions() {
        return instructions;
    }

	@Override
	public String fireWood(double pot_size) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public double electric() {
		// TODO Auto-generated method stub
		return Cooker.super.electric();
	}
}
