package JavaOOP.JavaOOP_Exercises.InterfacesAndAbstractionExercise._5_Telephony;

import java.util.Collections;
import java.util.List;

public class Smartphone implements Browsable, Callable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public List<String> browse() {
        return Collections.singletonList(urls.toString());
    }

    @Override
    public List<String> call() {
        return urls;
    }
}
