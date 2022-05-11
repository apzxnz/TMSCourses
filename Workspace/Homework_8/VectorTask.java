package Homework_8;


public class VectorTask {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2,1);
        Vector vector2 = new Vector(2, 1, 1);
        vector1.getInfoVector();
        vector2.getInfoVector();
        System.out.printf("Скалярное произведение векторов %s и %s -> %f\n", vector1, vector2, vector1.getScalarMultiplication(vector2));
        System.out.printf("Сложение векторов %s и %s -> %s\n", vector1, vector2, vector1.getSum(vector2));
        System.out.printf("Вычитание векторов %s и %s -> %s\n", vector1, vector2, vector1.getSubtraction(vector2));

        Vector compareResult = vector1.compare(vector2);
        System.out.printf("Сравнение векторов %s и %s.\n%s",
                vector1, vector2,
                compareResult != null ? "Вектор " + compareResult + " больше." : "Вектора равны");

        System.out.println("\nГенерация векторов");
        for (Vector vector : Vector.generateVectors(10)) {
            System.out.println(vector.toString());
        }
    }
}
