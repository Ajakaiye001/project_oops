package recipe_app;

import java.util.List;


public abstract class Recipe {
    private String name;
    private String description;
    private int serves;
    private String prep_time;
    private String cook_time;
    private Region region;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getServes() {
        return serves;
    }

    public String getPrepTime() {
        return prep_time;
    }

    public String getCookTime() {
        return cook_time;
    }
    
    

    public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	protected abstract Ingredients getIngredients();

    protected abstract List<Instruction> getInstructions();

    @Override
    public String toString() {
        return "Recipe: " + name + "\nDescription: " + description + "\nServes: " + serves +
                "\nPrep Time: " + prep_time + "\nCook Time: " + cook_time;
    }
}
