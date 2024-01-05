package uz.agzam.calculateshapeapp.dto.responses;

import uz.agzam.calculateshapeapp.model.Shape;

public class ShapeResponse {
    private final double area;
    private final double perimeter;

    public ShapeResponse(Shape shape) {
        this.area = shape.getArea();
        this.perimeter = shape.getPerimeter();
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

}
