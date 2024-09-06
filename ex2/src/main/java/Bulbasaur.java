public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        // TODO: Initialize id and level with appropriate values
        this.id = 1;
        this.level = 1;

    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        // If the new level is 32 or higher, evolve to Venusaur
        this.level = lv;
        if (lv >= 16 && lv < 32) {
            this.id = 2;
        } else if (lv >= 32) {
            this.id = 3;
        } else {
            this.id = 1;
        }
    }

    // getLevel method
    public int getLevel() {
        // TODO: Implement this method
        return this.level;
    
    }

    // getName method
    public String getName() {
        // TODO: Implement this method
        // Return the name based on the current id
        if (this.id == 1) {
            return "Bulbasaur";
        } else if (this.id == 2) {
            return "Ivysaur";
        } else if (this.id == 3) {
            return "Venusaur";
        }
        return ""; // Placeholder return value
    }

    // getID method
    public int getID() {
        // TODO: Implement this method
        return this.id;
    }

    // toString method
    @Override
    public String toString() {
        // Return a string representation of the Bulbasaur object
        return "Level: " + this.level + ", ID: " + this.id;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // TODO: Implement this method
        // Compare this Bulbasaur object with another object
        if (obj instanceof Bulbasaur) {
            Bulbasaur other = (Bulbasaur) obj;
            return this.id == other.id && this.level == other.level;
        }
        return false;
    }

    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur copy = new Bulbasaur();
        copy.id = this.id;
        copy.level = this.level;
        return copy;
    }
}