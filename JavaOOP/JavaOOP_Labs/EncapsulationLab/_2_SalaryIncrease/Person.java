package JavaOOP.JavaOOP_Labs.EncapsulationLab._2_SalaryIncrease;

public class Person {
    private static final int MIN_LENGTH = 3;
    private static final int MIN_SALARY = 460;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void increaseSalary(double bonus) {
        if (age < 30) {
            bonus = bonus / 2;
        }
        salary = salary * (1 + (bonus / 100));
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= MIN_SALARY) {
            throw new IllegalArgumentException("Salary cannot be less than " + MIN_SALARY + " leva");
        }
        this.salary = salary;
    }
    public void setFirstName(String firstName) {
        if (firstName.length() < MIN_LENGTH) {
            throw new IllegalArgumentException("First name cannot be less than " + MIN_LENGTH + " symbols");
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        if (lastName.length() < MIN_LENGTH) {
            throw new IllegalArgumentException("First name cannot be less than " + MIN_LENGTH + " symbols");
        }
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", firstName, lastName, salary);
    }
}

