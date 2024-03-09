package JavaOOP.JavaOOP_Exercises.EncapsulationExercise._1_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        //validateData(length, width, height);
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    /*private void validateData(double length, double width, double height) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative number");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative number");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative number");
        }
    }*/
    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative number");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative number");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative number");
        }
        this.height = height;
    }
    public double calculateSurfaceArea () {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
    public double calculateLateralSurfaceArea () {
        return 2 * length * height + 2 * width * height;
    }
    public double calculateVolume () {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                "Lateral Surface Area - %.2f%n" +
                "Volume - %.2f%n", calculateSurfaceArea(), calculateLateralSurfaceArea(), calculateVolume());
    }
}
