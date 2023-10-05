package c;

public class Cube implements Shape {
    private double side;

    public Cube() {}
    public Cube(double s) {side = s;}

    @Override
    public double area() {return 6*side*side;}
    public void setSide(double s) {side = s;}
    public double getSide() {return side;}
}
