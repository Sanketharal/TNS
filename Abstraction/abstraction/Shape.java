package abstraction;

public abstract class Shape {
   protected float area;
//    abstract method
    abstract void calcArea();


//    cocreate method

    void show(){
        System.out.println("the area of shape:"+area);
    }



}
