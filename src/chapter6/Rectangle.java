package chapter6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){

    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double perimeter(double length, double width){
        return (length*2) + (width*2);
    }
    public double area(double length, double width){
        return length*width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public  double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
