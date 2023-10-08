package architectoryHW6.bridge.shapes;

import architectoryHW6.bridge.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void shape() {
        System.out.println("circle");
        color.color();
    }
}