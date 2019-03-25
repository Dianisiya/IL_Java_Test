package person.consciousness;

public class Knowledge {

    private int level;

    public Knowledge(int level) {
        this.level = level < 0 ? 0 : level;
    }

    public boolean isHigherThat (double requiredLevel) {
        return Double.compare(this.level, requiredLevel) > 0;
    }
}
