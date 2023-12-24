package models;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        double deltaX = other.x- this.x;
        double deltaY = other.y- this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}