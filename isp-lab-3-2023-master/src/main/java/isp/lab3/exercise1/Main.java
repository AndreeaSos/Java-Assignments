package isp.lab3.exercise1;

public class Main {
    public static void main(String[] args) {
        Tree tree1=new Tree(3);
        Tree tree2=new Tree();

        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        tree2.grow(4);
        System.out.println(tree2.toString());
    }
}
