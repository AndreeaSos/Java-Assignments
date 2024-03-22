package isp.lab3.exercise4;

public class Main {
    public static void main(String[] args) {
        MyPoint point= new MyPoint(3,4,5);
        MyPoint point2=new MyPoint(7,8,9);
        System.out.println(point.distance(point2));
    }
}
