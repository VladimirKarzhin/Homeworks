package JavaOOP.JavaOOP_Labs.InterfacesAndAbstractionLab._4_SayHelloExtend;

public class European extends BasePerson {
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return String.format("Hello");
    }
}
