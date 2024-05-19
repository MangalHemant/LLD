import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;

public class ShapeFactory {


    Shape getShape(String input)
    {
        switch (input) {
            case "Circle":
                return new Circle();
                

                case "Rectangle":
                return new Rectangle();
            
        
            default:
                    return null;
        }
    }

}
