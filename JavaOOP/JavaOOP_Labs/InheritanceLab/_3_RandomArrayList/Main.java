package JavaOOP.JavaOOP_Labs.InheritanceLab._3_RandomArrayList;

public class Main {
    public static void main(String[] args) {

     RandomArrayList<Integer> numbers = new RandomArrayList<>();

     numbers.add(12);
     numbers.add(31);
     numbers.add(77);
     numbers.add(53);

        System.out.println(numbers.getRandomElement());
    }
}
