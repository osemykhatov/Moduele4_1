package Module4_1_1;


public class Circle {

    private int radius;
    private double areaCircle;

    Circle(int radius) {
        this.radius = radius;
        this.areaCircle = (Math.PI * Math.pow(radius, 2));

    }

    public double getAreaCircle() {
        return this.areaCircle;

    }
}


























