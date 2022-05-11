package Homework_6.figures;

abstract class Figure {

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
