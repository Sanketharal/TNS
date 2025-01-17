package abstraction;

public class Driver {

    public static void main(String[] args) {

        Rectangle r1=new Rectangle(5,4);
        Circle c1= new Circle();

        r1.calcArea();
        r1.show();


        System.out.println(c1.getClass());

        c1.calcArea();
        c1.show();
    }
}
