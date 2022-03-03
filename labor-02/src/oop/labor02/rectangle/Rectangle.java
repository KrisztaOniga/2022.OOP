package oop.labor02.rectangle;

public class Rectangle {

    //adattagok
    private double lenght;
    private double width;

    //Contructor
    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    //getterek
    public double getLength(){
        return this.lenght;
    }

    public double getWidth(){
        return this.width;
    }

    public double area(){
        return lenght * width;
    }

    public double perimeter(){
        return 2*(lenght + width);
    }
}
