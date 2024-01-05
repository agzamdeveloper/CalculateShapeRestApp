package uz.agzam.calculateshapeapp.model;

public class Rectangle extends Shape{
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.sideA + this.sideB);
    }
}
