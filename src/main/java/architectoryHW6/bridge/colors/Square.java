package architectoryHW6.bridge.colors;

import architectoryHW6.bridge.Color;
import architectoryHW6.bridge.shapes.Shape;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void shape() {
        System.out.println("square");
        color.color();
    }
}