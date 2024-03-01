public class Rectangle extends Shape {
    Rectangle(double h, double w){
        super(h,w);
    }
    void area(){
        double area = height*width;
        System.out.println("Area of Rectangle is: " +area);
    }
}
