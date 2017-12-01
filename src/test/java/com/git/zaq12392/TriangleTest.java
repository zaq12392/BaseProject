package com.git.zaq12392;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void getType() throws Exception {
        Triangle triangle = new Triangle(5,10, 5);

        String result = triangle.getType();

        Assert.assertEquals( "不是三角形",result);
    }

}
