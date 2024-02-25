package JavaOOP.JavaOOP_Labs.WorkingwithAbstractionLab._2_PointinRectangle;

public class Rectangle {
        private final Point bottomLeft;
    private final Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
    public Rectangle (int bottomRightX, int bottomLeftY, int topRightX, int topLeftY) {
        this.bottomLeft = new Point(bottomRightX, bottomLeftY);
        this.topRight = new Point(topRightX, topLeftY);
    }

    public boolean contains(Point point) {
        return point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX()
                && point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
    }
}
