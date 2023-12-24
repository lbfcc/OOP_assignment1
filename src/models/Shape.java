package models;

import java.util.ArrayList;

public class Shape {
    private final ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        this.points = points;

    }


    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }

    public double findLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            double currentDistance = currentPoint.distanceTo(nextPoint);
            if (currentDistance > longestSide) {
                longestSide = currentDistance;
            }
        }

        return longestSide;
    }

    public double findAverageSide() {
        double totalLength = 0;
        int numSides = points.size();

        for (int i = 0; i < numSides; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numSides);

            totalLength += currentPoint.distanceTo(nextPoint);
        }

        return totalLength / numSides;
    }
}