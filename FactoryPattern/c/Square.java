package c;

public class Square implements Shape {
    private double side;

    public Square() {  }
    public Square(double s) {
        side = s;
    }

    @Override
    public double area() {return side*side;}
    public void setSide(double s) {side = s;}
    public double getSide() {return side;}
}