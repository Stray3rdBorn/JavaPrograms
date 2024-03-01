public class Triangle extends Shape{
    Triangle(double h, double w){
        super(h,w);
    }
    void area(){
        double area = 0.5*height*width;
        System.out.println("Area of Triangle is: " +area);
    }
}
