 abstract class Shape implements  ShapeName{

    public abstract Shapes getNameShape();


}
interface ShapeName{


    public  Shapes getNameShape();
}

enum Shapes{
    Triangle,
    Quad,
    Circle,
    Rectangle,
    Pentagon
}
class Triangle extends Shape implements  ShapeName{



    public  Shapes getNameShape() {
        return Shapes.Triangle;
    }
}
class Quad extends Shape implements ShapeName{

    @Override
    public Shapes getNameShape() {
        return Shapes.Quad;
    }
}
class Circle extends Shape implements ShapeName{

    @Override
    public Shapes getNameShape() {
        return Shapes.Circle;
    }
}
class Rectangle extends Shape implements ShapeName{

    @Override
    public Shapes getNameShape() {
        return Shapes.Rectangle;
    }
}
class Pentagon extends Shape implements  ShapeName{

    @Override
    public Shapes getNameShape() {
        return Shapes.Pentagon;
    }
}
class PrintName {
    public void printNameFigure(Shape shapes) {
        System.out.println(shapes.getNameShape());


    }
}
class Main{
    public static void main(String[] args) {
        PrintName printName = new PrintName();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Quad quad = new Quad();
        Pentagon pentagon = new Pentagon();
        printName.printNameFigure(pentagon);
        printName.printNameFigure(rectangle);
        printName.printNameFigure(circle);
        printName.printNameFigure(circle);
        printName.printNameFigure(triangle);
    }
}
