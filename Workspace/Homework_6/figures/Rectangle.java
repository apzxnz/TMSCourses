package Homework_6.figures;

public class Rectangle extends Figure {

    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    protected float getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    protected float getArea() {
        return width * height;
    }
}
