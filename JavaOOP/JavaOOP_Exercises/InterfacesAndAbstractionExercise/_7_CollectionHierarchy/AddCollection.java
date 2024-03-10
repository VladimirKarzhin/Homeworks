package JavaOOP.JavaOOP_Exercises.InterfacesAndAbstractionExercise._7_CollectionHierarchy;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String item) {
        super.addLast(item);
        return super.getItems().size() - 1;
    }
}
