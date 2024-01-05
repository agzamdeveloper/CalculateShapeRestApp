package uz.agzam.calculateshapeapp.dto.requests;

public class TriangleRequest {
    public double sideA;
    private double sideB;
    private double corner;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getCorner() {
        return corner;
    }

    public void setCorner(double corner) {
        this.corner = corner;
    }
}
