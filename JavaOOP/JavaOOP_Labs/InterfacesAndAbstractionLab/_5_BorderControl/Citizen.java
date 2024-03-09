package JavaOOP.JavaOOP_Labs.InterfacesAndAbstractionLab._5_BorderControl;

public class Citizen implements Identifiable {
    private final String name;
    private final int age;
    private final String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }
}
