package afternoon;

public abstract class Shape {
    protected abstract void draw();
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    public final int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    @Override
    protected void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Shaper {

    public void drawAnyShape() {

        Shape tr = new Triangle(); // upcasting
        tr.draw();
//        tr.area();
        Triangle cpy = (Triangle) tr; //down casting
        cpy.area();

        Shape rec = new Rectangle();
        rec.draw();
    }
}
