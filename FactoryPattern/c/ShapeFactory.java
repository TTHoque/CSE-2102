package c;

public class ShapeFactory {
    public Shape getShape(String shapetype, double measure) {
        if (shapetype == null) {
            return null;
        }

        if (shapetype.equalsIgnoreCase("CIRCLE")) {
            if (Circle.getCountCircles() > 3) {
                System.errprintln("No more than 3 circles");
                return null;
            }
            Shape s = new Circle();
            ((Circle) s).setradius(measure);
            return s;
        } else 
            if (shapetype.equalsIgnoreCase("SQUARE")) {
                Shape s = new Square();
                ((Square) s).setSide(measure);
                return s;
            }
        else if (shapetype.equalsIgnoreCase("CUBE")) {
            Shape s = new Cube();
            ((Cube) s).setSide(measure);
            return s;
        }

        return null;
    }
}