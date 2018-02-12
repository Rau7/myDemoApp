package com.mycompany.app;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

   public void testEmptyFound() {
      ArrayList<Integer> array = null;
      ArrayList<Integer> array2 = null;
      assertEquals("One of them is empty",new App().bigger(array, 4, array2 ,3));
    }

    public void testEquals() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals("Equal "+2+"s",new App().bigger(array, 2, array2 ,2));
    }

    public void testBigis1Array() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals("For given Integers First Array contains more "+4+"s.",new App().bigger(array, 2, array2 ,4));
      
    }

    public void testBigis2Array() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 2, 3, 4));
      assertEquals("For given Integers Second Array contains more "+4+"s.",new App().bigger(array, 2, array2 ,4));
      
    }

  

}
