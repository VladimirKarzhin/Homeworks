package JavaOOP.JavaOOP_Exercises.InterfacesAndAbstractionExercise._7_CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable, Addable{
    @Override
    public String remove() {
        return super.removeLast();
    }

    @Override
    public int add(String name) {
        super.addFirst(name);
        return 0;
    }
}
