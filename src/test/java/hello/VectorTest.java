package com.mycompany.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
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
    @Test
    public void DotProduct()
    {
        float delta = 1;
        float[] vec1 = {1,2,3};
        float[] vec2 = {4,5,8};
        float expectedAnswer = 56334;

        assertTrue(Vector.Dot(vec1,vec2) == (4+10+24));
        
    }

}
