package JavaOOP.JavaOOP_Labs.WorkingwithAbstractionLab._4_HotelReservation;

public enum Season {
    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);

    private final int factor;
    Season(int factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
