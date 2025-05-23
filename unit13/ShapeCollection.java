import java.util.*;

public class ShapeCollection {
    private ArrayList<Shape> shapes;

    public ShapeCollection() {
        this.shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public int numberOfSides(String shapeName) {
        for (Shape shape : shapes) {
            if (shape.getName().equals(shapeName)) {
                return shape.getNumberOfSides();
            }
        }
        return -1;
    }

    public double averageNumberOfSides() {
        if (shapes.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getNumberOfSides();
        }
        return (double) sum / shapes.size();
    }

    public ArrayList<Shape> shapesWithEvenSides() {
        ArrayList<Shape> evenShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.getNumberOfSides() % 2 == 0) {
                evenShapes.add(shape);
            }
        }
        return evenShapes;
    }
    
     public static void main(String[] args) {
        ShapeCollection collection = new ShapeCollection();
        
        collection.addShape(new Shape("Triangle", 3));
        collection.addShape(new Shape("Square", 4));
        collection.addShape(new Shape("Hexagon", 6));
        collection.addShape(new Shape("Pentagon", 5));

        System.out.println("Sides of Square: " + collection.numberOfSides("Square"));
        System.out.println("Average number of sides: " + collection.averageNumberOfSides());
         
        ArrayList<Shape> evenShapes = collection.shapesWithEvenSides();
        System.out.println("Shapes with even number of sides:");
        for (Shape shape : evenShapes) {
            System.out.println(shape.getName() + ": " + shape.getNumberOfSides());
        }
     }
}

