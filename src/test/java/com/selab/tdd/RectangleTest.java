package com.selab.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RectangleTest {
    @Test
    public void negativeSideTest()
    {
        try
        {
            Rectangle rectangle = new Rectangle(-5, 10);
            fail("Expected NegativeSideException did not occur.");
        }
        catch (NegativeSideException e)
        {
            System.out.println("Successfully passed first negativeSideTest");
        }

        try
        {
            Rectangle rectangle = new Rectangle(5, -10.4);
            fail("Expected NegativeSideException did not occur.");
        }
        catch (NegativeSideException e)
        {
            System.out.println("Successfully passed second negativeSideTest");
        }

        try
        {
            Rectangle rectangle = new Rectangle(-15.59, -13.001);
            fail("Expected NegativeSideException did not occur.");
        }
        catch (NegativeSideException e)
        {
            System.out.println("Successfully passed third negativeSideTest");
        }
    }

    @Test
    public void computeAreaTest() throws NegativeSideException {
        double delta = 1e-4;
        Rectangle rectangle1 = new Rectangle(5, 10);
        assertEquals(50.0, rectangle1.computeArea(), delta);

        Rectangle rectangle2 = new Rectangle(3.153, 7.568);
        assertEquals(3.153 * 7.568, rectangle2.computeArea(), delta);

        Rectangle rectangle3 = new Rectangle(1500.189, 8894153.4231);
        assertEquals(1500.189*8894153.4231, rectangle3.computeArea(), delta);
    }

    @Test
    public void setterAndGetterTest() throws NegativeSideException {
        double w = 3, h = 4, new_w = 5, new_h = 6;
        Rectangle rectangle = new Rectangle(w, h);
        
        rectangle.setWidth(new_w);
        assertEquals(new_w, rectangle.getWidth());
        
        rectangle.setHeight(new_h);
        assertEquals(new_h, rectangle.getHeight());

        try {
            rectangle.setWidth(-1);
            fail("Expected NegativeSideException did not occur.");
        }
        catch (NegativeSideException e) {}
        
        try {
            rectangle.setHeight(-1);
            fail("Expected NegativeSideException did not occur.");
        }
        catch (NegativeSideException e) {}
    }

}
