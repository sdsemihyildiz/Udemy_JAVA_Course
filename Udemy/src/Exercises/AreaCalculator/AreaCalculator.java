package Exercises.AreaCalculator;

public class AreaCalculator {
    static double area(double radius) {

        if (radius < 0) {
            return -1;
        }
        double areaOfCircle = radius * radius * Math.PI;
        return areaOfCircle;


    }

    static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        double areaOfRectangle = x * y;
        return areaOfRectangle;

    }
}
