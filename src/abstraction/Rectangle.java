package abstraction;

public class Rectangle extends Shape{
float width;
float height;

    public Rectangle() {
        this.width=5.5f;
        this.height=4.2f;
    }

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    @Override
    void calcArea() {
        area=width*height;
    }
}
