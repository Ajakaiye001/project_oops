package recipe_app;

import java.util.List;

public class Instruction {
    private int step;
    private String description;
    private List<String> details;

    public int getStep() {
        return step;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getDetails() {
        return details;
    }
}
