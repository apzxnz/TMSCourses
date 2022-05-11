package Homework_6.figures;

public abstract class Figure {

    String figureType;

    public Figure(String figureType) {
        this.figureType = figureType;
    }

    protected abstract float getPerimeter();
    protected abstract float getArea();

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }
}
