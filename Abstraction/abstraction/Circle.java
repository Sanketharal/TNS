package abstraction;

public class Circle extends Shape {
    float radius;


    public Circle() {

        this.radius=4f;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    void calcArea() {
        area= (float) (3.14*radius*radius);
    }
}
