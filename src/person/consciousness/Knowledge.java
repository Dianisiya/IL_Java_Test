package person.consciousness;

public class Knowledge {

    private int level;

    public Knowledge(int level) {
        this.level = level < 0 ? 0 : level;
    }

    public int getLevel() {
        return level;
    }
}
