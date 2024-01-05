package uz.agzam.calculateshapeapp.services;

import org.springframework.stereotype.Service;
import uz.agzam.calculateshapeapp.dto.requests.CircleRequest;
import uz.agzam.calculateshapeapp.dto.requests.RectangleRequest;
import uz.agzam.calculateshapeapp.dto.requests.SquareRequest;
import uz.agzam.calculateshapeapp.dto.requests.TriangleRequest;
import uz.agzam.calculateshapeapp.dto.responses.ShapeResponse;
import uz.agzam.calculateshapeapp.model.Circle;
import uz.agzam.calculateshapeapp.model.Rectangle;
import uz.agzam.calculateshapeapp.model.Square;
import uz.agzam.calculateshapeapp.model.Triangle;

@Service
public class CalculateService {
    public ShapeResponse calculateSquare(SquareRequest request){
        Square square = new Square(request.getSide());

        return new ShapeResponse(square);
    }

    public ShapeResponse calculateCircle(CircleRequest request){
        Circle circle = new Circle(request.getRadius());

        return new ShapeResponse(circle);
    }

    public ShapeResponse calculateRectangle(RectangleRequest request){
        Rectangle rectangle = new Rectangle(request.getSideA(), request.getSideB());

        return new ShapeResponse(rectangle);
    }

    public ShapeResponse calculateTriangle(TriangleRequest request){
        Triangle triangle = new Triangle(request.getSideA(), request.getSideB(), request.getCorner());

        return new ShapeResponse(triangle);
    }
}
