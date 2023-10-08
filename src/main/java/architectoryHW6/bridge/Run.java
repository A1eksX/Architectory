package architectoryHW6.bridge;

import architectoryHW6.bridge.colors.Gray;
import architectoryHW6.bridge.shapes.Circle;
import architectoryHW6.bridge.shapes.Shape;

public class Run {
    public static void main(String[] args) {
        Shape circle = new Circle(new Gray());
        circle.shape();
    }
}