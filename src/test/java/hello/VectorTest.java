package com.mycompany.app;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import hello.Vector;
/**
 * Unit test for simple App.
 */
public class VectorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void VectorSubtraction()
    {   
        float delta = 1;
        float[] vec1 = {1,2,3};
        float[] expectedAnswer = {0,0,0};
        
        assertArrayEquals(Vector.Sub(vec1,vec1),expectedAnswer,delta);
        
    }
    @Test
    public void VectorAddition()
    {
        float delta = 1;
        float[] vec1 = {1,2,3};
        float[] expectedAnswer = {2,4,6};

        assertArrayEquals(Vector.Add(vec1,vec1),expectedAnswer,delta);
        
    }

}
