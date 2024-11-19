package morning;

public abstract class Shape {
    abstract protected void draw();
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Rectangle extends Shape {

    @Override
    protected void draw() {
        System.out.println("Drawing Rectangle");
    }

    public int area() {
        return 0;
    }
}

class Shaper {

    public void drawShape(Shape s) {

        s.draw();

    }

    public void start() {

//        Shape s = new Shape();

//        Triangle triangle = new Triangle();
        Shape triangle = new Triangle();

//        Rectangle rectangle = new Rectangle();
        Shape rectangle = new Rectangle();

        drawShape(triangle); // polymorphism
        drawShape(rectangle);
    }

}
