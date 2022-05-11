package Homework_6.figures;

public class Circle extends Figure {

    private final float radius;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    protected float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    protected float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}
