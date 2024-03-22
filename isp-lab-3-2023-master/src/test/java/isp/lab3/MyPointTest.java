package isp.lab3;

import isp.lab3.exercise4.MyPoint;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPointTest {

    @Test
    public void testDistance(){
        MyPoint point = new MyPoint(3,5,9);
        assertEquals(9,(int)point.distance(6,2,0));
    }
}
