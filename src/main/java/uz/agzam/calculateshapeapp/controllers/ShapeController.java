package uz.agzam.calculateshapeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.agzam.calculateshapeapp.dto.requests.CircleRequest;
import uz.agzam.calculateshapeapp.dto.requests.RectangleRequest;
import uz.agzam.calculateshapeapp.dto.requests.SquareRequest;
import uz.agzam.calculateshapeapp.dto.requests.TriangleRequest;
import uz.agzam.calculateshapeapp.dto.responses.ShapeResponse;
import uz.agzam.calculateshapeapp.services.CalculateService;

@RestController
@RequestMapping("/api")
public class ShapeController {
    private final CalculateService calculateService;

    @Autowired
    public ShapeController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @PostMapping("/calculate-square")
    public ShapeResponse calculateSquare(@RequestBody SquareRequest request){
        return calculateService.calculateSquare(request);
    }

    @PostMapping("/calculate-circle")
    public ShapeResponse calculateCircle(@RequestBody CircleRequest request){
        return calculateService.calculateCircle(request);
    }

    @PostMapping("/calculate-rectangle")
    public ShapeResponse calculateRectangle(@RequestBody RectangleRequest request){
        return calculateService.calculateRectangle(request);
    }

    @PostMapping("/calculate-triangle")
    public ShapeResponse calculateTriangle(@RequestBody TriangleRequest request){
        return calculateService.calculateTriangle(request);
    }
}
