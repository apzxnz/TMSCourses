package Homework_6.figures;

public class Triangle extends Figure {

    private final float aSide;
    private final float bSide;
    private final float height;
    private final float baseSide;


    public Triangle(float aSide, float bSide, float height, float baseSide) {
        super("Triangle");
        this.aSide = aSide;
        this.bSide = bSide;
        this.height = height;
        this.baseSide = baseSide;
    }

    @Override
    protected float getPerimeter() {
        return aSide + baseSide + bSide;
    }

    @Override
    protected float getArea() {
        return (float) (0.5 * baseSide * height);
    }
}
