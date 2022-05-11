package Homework_6.figures;

public class FiguresTask {
    public static void main(String[] args) {
        Figure circle = new Circle(10);
        Figure rectangle = new Rectangle(10, 20);
        Figure triangle = new Triangle(10, 15, 10, 30);

        Figure[] figures = {circle, rectangle, triangle};
        float sumPerimeter = 0;
        for (Figure figure : figures) {
            System.out.printf("Тип фигуры: %s, периметр фигуры: %f, площадь фигуры: %f \n",
                    figure.getFigureType(), figure.getPerimeter(), figure.getArea());
            sumPerimeter += figure.getPerimeter();
        }

        System.out.printf("\nСумма периметра всех фигур: %f", sumPerimeter);


    }
}
