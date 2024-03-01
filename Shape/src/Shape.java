public abstract class Shape {
    double height, width;

    Shape(){

    }
    Shape(double h, double w){
        height=h;
        width=w;
    }

    abstract void area();
}
