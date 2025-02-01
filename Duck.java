public class Duck {
    String name;

    public Duck() {
        this.name = "Hubert";
    }

    public Duck(String name) {
        this.setName(name);
    }

    public Duck(Duck original) {
        this.setName(original.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Name: " + this.name;
    }

    public boolean equals(Duck other) {
        return this.name.equals(other.name);
    }
}
