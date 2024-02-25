package JavaOOP.JavaOOP_Labs.WorkingwithAbstractionLab._4_HotelReservation;

public class PriceCalculator {
    private final double pricePerDay;
    private final int numberOfDay;
    private final Season season;
    private final DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDay, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDay = numberOfDay;
        this.season = season;
        this.discountType = discountType;
    }
    public double calculatePrice() {
        return pricePerDay * numberOfDay * season.getFactor() * discountType.getDiscount();
    }
}
