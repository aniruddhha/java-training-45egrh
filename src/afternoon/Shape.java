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
