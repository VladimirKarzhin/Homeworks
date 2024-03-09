package JavaOOP.JavaOOP_Labs.InterfacesAndAbstractionLab._4_SayHelloExtend;

public class Chinese extends BasePerson{
    public Chinese(String name) {
        super(name);

    }
    @Override
    public String sayHello() {
        return String.format("Djydjybydjy");
    }
}
