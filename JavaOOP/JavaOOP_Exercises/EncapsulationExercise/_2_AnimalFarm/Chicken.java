package JavaOOP.JavaOOP_Exercises.EncapsulationExercise._2_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }
    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        if (age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    private double calculateProductPerDay () {
        if (getAge() >= 0 && getAge() <= 5) {
            return 2;
        } else if (getAge() >= 6 && age <= 11) {
            return 1;
        }
        return 0.75;
    }
    public double productPerDay() {
         return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", getName(), getAge(), productPerDay());
    }
}
