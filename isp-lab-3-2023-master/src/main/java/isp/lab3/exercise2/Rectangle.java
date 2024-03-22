package isp.lab3.exercise2;

public class Rectangle {
    private int width=1;
    private int length=2;
    private String color="red";

    public Rectangle(int width,int length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(int width,int length,String color){
        this.width=width;
        this.length=length;
        this.color=color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int getArea(){
        return width*length;
    }

    public int getPerimeter(){
        return 2*width+2*length;
    }
}
