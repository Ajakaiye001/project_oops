package recipes;

import java.util.List;

import recipe_app.Cooker;
import recipe_app.Ingredients;
import recipe_app.Instruction;
import recipe_app.Recipe;

public class SouthAmericanRecipe extends Recipe implements Cooker{
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
		String pot = "Firewood pot size:"+pot_size;
		System.out.println(pot);
		return pot;
	}
	

}
