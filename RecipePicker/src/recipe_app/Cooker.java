package recipe_app;

public interface Cooker {

	double POT_SIZE = 32;

	static double gasCooker() {
		return POT_SIZE;
	}

	default double electric() {
		return POT_SIZE;
	}

	String fireWood(double pot_size);

}
