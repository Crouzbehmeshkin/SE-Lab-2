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

}
