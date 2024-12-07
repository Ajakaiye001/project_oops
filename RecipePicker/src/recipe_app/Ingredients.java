package recipe_app;

import java.util.List;

public class Ingredients {
    private List<Item> main;
    private List<Item> accompaniments;

    public List<Item> getMain() {
        return main;
    }

    public List<Item> getAccompaniments() {
        return accompaniments;
    }
}
