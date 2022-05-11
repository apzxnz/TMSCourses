package Homework_8;

public class Vector {
    private double x;
    private double y;
    private double z = 0;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getTypeVector() {
        return this.z == 0 ? "2d" : "3d";
    }

    public double getLength() {
        return Math.abs(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2)));
    }

    @Override
    public String toString() {
        return this.z == 0 ? "(" + this.x + ", " + this.y + ")" : "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public void getInfoVector() {
        System.out.printf("Вектор -> %s, тип вектора: %s, длина вектора: %f \n", this, getTypeVector(), this.getLength());
    }

    public double getScalarMultiplication(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    public Vector getSum(Vector vector) {
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    public Vector getSubtraction(Vector vector) {
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }

    public static Vector[] generateVectors(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector( Math.random() * 10, Math.random() * 10, Math.random() * 10);
        }
        return vectors;
    }

    public Vector compare(Vector vector) {
        if (this.getLength() > vector.getLength()) {
            return this;
        } else if (this.getLength() < vector.getLength()) {
            return vector;
        }
        return null;
    }
}
