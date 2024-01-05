package uz.agzam.calculateshapeapp.model;

public class Triangle extends Shape{
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double corner;

    public Triangle(double sideA, double sideB, double corner) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.corner = corner;
        this.sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) -
                2 * this.sideA * this.sideB * Math.cos(Math.toRadians(this.corner)));
    }

    @Override
    public double getArea() {
        return 0.5 * this.sideA * this.sideB * Math.abs(Math.sin(Math.toRadians(this.corner)));
    }

    @Override
    public double getPerimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }
}
