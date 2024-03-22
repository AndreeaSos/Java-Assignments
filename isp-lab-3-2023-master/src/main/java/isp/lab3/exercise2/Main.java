package isp.lab3.exercise2;

public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,3);
        System.out.println("area of r1="+r1.getArea());
        System.out.println("perimeter of r1="+r1.getPerimeter());
        System.out.println("color of r1 "+r1.getColor());
        System.out.println("");

        Rectangle r2=new Rectangle(4,5,"blue");
        System.out.println("area of r2="+r2.getArea());
        System.out.println("perimeter of r2="+r2.getPerimeter());
        System.out.println("color of r2 "+r2.getColor());
    }
}
