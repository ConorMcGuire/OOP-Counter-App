package oop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Count class.
 */
public class AppTest 
{
    /**
     * Test the click() method
     * It should increment the counter by one.
     */
    @Test
    public void clickTest1() {
        Counter counter = new Counter();
        counter.click();    // should increment by 1
        int expected = 1;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }

    @Test
    public void clickTest2()
    {
        Counter counter = new Counter(5);
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        int expected = 5;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }

    //TODO add a test for Counter undo()
    @Test
    public void undoTest1() //Test that the undo method decreases by one
    {
        Counter counter = new Counter();
        counter.click();
        counter.click();
        counter.undo();
        int expResult = 1;
        int result = counter.getCount();
        assertEquals(expResult, result);
    }

    @Test
    public void undoTest2() //Test that the undo method decreases by one
    {
        Counter counter = new Counter();
        counter.click();
        counter.undo();
        counter.undo();
        counter.undo();
        int expResult = 0;
        int result = counter.getCount();
        assertEquals(expResult, result);
    }

}
