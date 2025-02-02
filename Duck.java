public class Duck {
    //instance variables
    String name;
    int ageInYears;
    double weightInPounds;

    //constructors
    public Duck() {
        this.name = "Hubert";
        this.ageInYears = 1;
        this.weightInPounds = 1.8;
    }

    public Duck(String name, int age, double weight) {
        this.setAll(name, age, weight);
    }

    public Duck(Duck original) {
        this.setAll(original.name, original.ageInYears, original.weightInPounds);
    }

    //mutators
    public void setAll(String name, int age, double weight) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.ageInYears = age;
    }

    public void setWeight(double weight) {
        this.weightInPounds = weight;
    }

     //accessors
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.ageInYears;
    }

    public double getWeight() {
        return this.weightInPounds;
    }

    //other methods
    public String toString() {
        return "Name: " + this.name + "\nAge: " + ageInYears + " year(s) old\nWeight: " + weightInPounds + " lbs";
    }

    public boolean equals(Duck other) {
        return this.name.equals(other.name) && this.ageInYears == other.ageInYears &&
        this.weightInPounds == other.weightInPounds;
    }
}
