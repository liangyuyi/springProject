package com.liangyuyi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liangyuyi on 2018/2/8
 */
public class JunitTest {

    @Test
    public void testUtil(){
        String jsonStr1 = "{\"name\": \"liangyuyi\"}";

        System.out.println(jsonStr1);

        Assert.assertTrue(jsonStr1.length() < 30);
    }
}
