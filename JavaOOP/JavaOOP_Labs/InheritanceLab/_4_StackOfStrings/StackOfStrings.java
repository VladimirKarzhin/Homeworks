package JavaOOP.JavaOOP_Labs.InheritanceLab._4_StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(data.size() - 1, item);
    }
    public String pop() {
        return data.remove(data.size() - 1);
    }
    public String peek() {
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        if (data.size() <= 0) {
            return true;
        }
        return false;
    }
}
