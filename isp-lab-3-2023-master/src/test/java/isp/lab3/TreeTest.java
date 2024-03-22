package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {

    @Test
    public void testGrow(){
        Tree tree1=new Tree();
        assertEquals(15,tree1.getHeigh());

        tree1.grow(2);
        assertEquals(17,tree1.getHeigh());
    }

    @Test
    public void testToString(){
        Tree tree1=new Tree();
        assertEquals( "Tree{heigh=15}",tree1.toString());
    }

    @Test
    public void testNegativaGrow(){
        Tree tree1= new Tree();
        tree1.grow(-3);
        assertEquals(15,tree1.getHeigh());
    }
}
