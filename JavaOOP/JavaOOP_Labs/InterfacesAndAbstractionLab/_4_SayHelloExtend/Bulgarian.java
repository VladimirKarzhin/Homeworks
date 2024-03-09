package JavaOOP.JavaOOP_Labs.InterfacesAndAbstractionLab._4_SayHelloExtend;

public class Bulgarian extends BasePerson {
    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return String.format("Здравей");
    }
}
